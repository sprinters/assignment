package com.assignment.expedia.base.processor;

import com.assignment.expedia.base.db.storage.DealStorage;
import com.assignment.expedia.base.db.storage.DealStorageHelper;
import com.assignment.expedia.model.HotelDeal;
import com.assignment.expedia.utils.misc.BoundryUtils;
import com.assignment.expedia.utils.misc.Pair;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HotelDealBasedProcessor implements SystemProcessor<List<Object>> {

	@Override
	public void doProcess(List<Object> p_input_value) {
		
		if(BoundryUtils.isNullOrEmpty(p_input_value)) {
			System.out.println("[There is nothing to be processed]");
			return;
		}

        try {
            processThings(p_input_value);
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
	
	//----------------------------------------------------------------------------
	/**
	 * 
	 * @param p_input_value
	 */
	private void processThings(List<Object> p_input_value) throws ParseException {
		
		System.out.println("[Deal Storage is about to start.]");
		DealStorage.init(p_input_value);
		System.out.println("[Deal Storage have been initialized successfully.]");
		
		int fixUp	=	0;
		List<HotelDeal> hotelDeals	=	new ArrayList<HotelDeal>();
		System.out.println("[Process Hotel Deals one by one.]");
		for(Object l_single_entry : p_input_value) {
			HotelDeal l_current_hotel_deal	=	new HotelDeal();
			if(l_single_entry instanceof Map) {
				Map l_hotel_deal_map	=	(Map) l_single_entry;
				l_current_hotel_deal.setProperties(l_hotel_deal_map);
				hotelDeals.add(l_current_hotel_deal);
			}
			processSubThings(l_current_hotel_deal,fixUp);
			fixUp++;
		}
		processRemainingThings(hotelDeals);
		System.out.println("[All Deal Hotel have been processed successfully.]");
		
	}
	
	//-------------------------------------------------------------------------------
	/**
	 * 
	 */
	private void processRemainingThings(List<HotelDeal> hotelDeals) {
		DealStorageHelper.init(hotelDeals);
	}

	//------------------------------------------------------------------------------
	/**
	 * 
	 * @param p_current_hotel_deal
	 * @param p_at
	 */
	private void processSubThings(HotelDeal p_current_hotel_deal, Integer p_at) {
		System.out.println("[Going to populate data for hotel deal:]"+p_current_hotel_deal);
		
		DealStorage.addEntry(p_current_hotel_deal.getCity(), p_current_hotel_deal,String.valueOf(0));
		DealStorage.addEntry(p_current_hotel_deal.getStreetAddress().trim(), p_current_hotel_deal,String.valueOf(1));
		DealStorage.addEntry(Pair.makePair(p_current_hotel_deal.getLatitude(),p_current_hotel_deal.getLongitude()),
                p_current_hotel_deal,String.valueOf(2));
		DealStorage.addEntry(Pair.makePair(p_current_hotel_deal.getLongitude(),p_current_hotel_deal.getLatitude()),
                p_current_hotel_deal,String.valueOf(2));
		
		System.out.println("[Data have been populated successfully.]");
	}
}
