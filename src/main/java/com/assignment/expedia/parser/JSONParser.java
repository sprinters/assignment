package com.assignment.expedia.parser;

import java.util.List;

import com.assignment.expedia.utils.json.JSONHelper;
import com.assignment.expedia.utils.misc.BoundryUtils;

public class JSONParser implements Parser<String>  {

	@Override
	public Object parse(String p_value_to_parse) {
		
		if(BoundryUtils.isNullOrEmpty(p_value_to_parse)) {
			System.out.println("[Unable to parse Blank Input.]");
			return null;
		}
		
		List<Object> parsedInput	=	JSONHelper.convertJSONStringToList(p_value_to_parse);
		return parsedInput;
	}
	
}
