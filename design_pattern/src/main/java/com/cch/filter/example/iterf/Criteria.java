package com.cch.filter.example.iterf;

public interface Criteria<T> {
	/**
	 * pop up a message when criteria is not matched.
	 * 
	 * @return
	 */
	String popMsg();

	/**
	 * check data whether match with the criteria.
	 * 
	 * @param data
	 * @return
	 */
	boolean checkCriteria(T data);

}
