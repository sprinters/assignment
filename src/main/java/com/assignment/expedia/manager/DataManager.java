package com.assignment.expedia.manager;

import com.assignment.expedia.base.processor.HotelDealBasedProcessor;
import com.assignment.expedia.base.processor.SystemProcessor;
import com.assignment.expedia.exception.ManagedException;
import com.assignment.expedia.parser.JSONParser;
import com.assignment.expedia.parser.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class DataManager extends AbstractManager {

	private URLConnection urlConnection;
	private URL urlToBeOperate;
	private HttpURLConnection connection;
	@Override
	public void manage() throws ManagedException { 
		try {
			String url = "http://deals.expedia.com/beta/deals/hotels.json";
            System.out.println("[Going to collect data from suplied URL] :"+url);
            String collectedData	=	startManageOperation(url);
            System.out.println("[Data have been collected]:"+collectedData);

            System.out.println("[Going to parse JSON]");
            Parser<String> parser	=	new JSONParser();
			List<Object> afterParsing	=	(List<Object>) parser.parse(collectedData);
            System.out.println("[JSON have been parsed successfully]:"+afterParsing.size());

            System.out.println("[Now Input is going processing phase]");
            SystemProcessor<List<Object>> l_system_processor    =   new HotelDealBasedProcessor();
            l_system_processor.doProcess(afterParsing);
            System.out.println("[Input have been processed successfully]");
        } catch(Exception e) {
            System.out.println("Some Problem have been occured while parsing and loading data.");
            e.printStackTrace();
        }
	}
	
	//----------------------------------------------------------------------
	/**
	 * 
	 * @param p_url
	 * @throws Exception 
	 */
	private String startManageOperation(String p_url) throws Exception {
		BufferedReader l_reader	=	null;
		try {
			urlToBeOperate	=	new URL(p_url);
			connection = (HttpURLConnection) urlToBeOperate.openConnection();
			connection.setRequestMethod("GET");
			connection.setReadTimeout(100*1000);
			connection.connect();
	 
		      
		    l_reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		    StringBuilder l_input_data = new StringBuilder();
		    String l_line = null;
		    while ((l_line = l_reader.readLine()) != null){
		    	 l_input_data.append(l_line);
		    }
		    return l_input_data.toString();
	    }
	    catch (Exception e){
	      e.printStackTrace();
	      throw e;
	    }
	    finally{
	      if (l_reader != null){
	        try{
	        	l_reader.close();
	        }
	        catch (IOException ioe){
	          ioe.printStackTrace();
	        }
	      }
	    }
		
	}
	

}
