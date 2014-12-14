package com.assignment.expedia.utils.misc;

/**
 * 
 * @author sandeepandey
 *
 * @param <T>
 */
public interface Filter<T> {
	public boolean isAcceptable(T p_value_to_accept);
}
