package com.assignment.expedia.utils.misc;

import java.util.Collection;
import java.util.Map;

public class BoundryUtils {
	
	
	public static <T> boolean isNull(T p_input_value) {
		return p_input_value	==	null;
	}
	
	@SuppressWarnings("unchecked")
	public static<T> boolean isEmpty(T p_input_value) {
		
		if(isNull(p_input_value)) {
			return false;
		}
		
		if(p_input_value instanceof String) {
			return ((String)p_input_value).trim().length()	==	0;
		} else if(p_input_value instanceof Collection) {
			return ((Collection<T>)p_input_value).isEmpty();
		} else if(p_input_value instanceof Map) {
			return ((Map<T,T>)p_input_value).isEmpty();
		} else if(p_input_value.getClass().isArray()) {
			return ((Object[])p_input_value).length	==	0;
		} else {
			return false;
		}
	}
	
	public static boolean isNullOrEmpty(Object p_input_value) {
		return isNull(p_input_value) || isEmpty(p_input_value);
	}
}
