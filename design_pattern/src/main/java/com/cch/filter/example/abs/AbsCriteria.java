package com.cch.filter.example.abs;

import com.cch.filter.example.iterf.Criteria;

public abstract class AbsCriteria<T> implements Criteria<T> {
	/**
	 * please initialize message When you need to pop up it.
	 */
	public abstract void initMessage();

	private String message;

	public String popMsg() {
		return getMessage();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
