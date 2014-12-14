package com.assignment.expedia.parser;

public interface Parser<T> {
	
	public Object parse(T p_value_to_parse);
}
