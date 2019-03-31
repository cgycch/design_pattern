package com.cch.filter.example;

import java.util.ArrayList;
import java.util.List;

import com.cch.filter.example.iterf.Criteria;

public class CriteriaFilers<T> {
	
	private String message;

	private List<Criteria<T>> criteriaLists = new ArrayList<Criteria<T>>();
	
	
	public boolean criteriasValidate(T data) {
		boolean isValid = true;
		for (Criteria<T> criteria : criteriaLists) {
			isValid = criteria.checkCriteria(data);
			if (!isValid) {
				message = criteria.popMsg();
				break;
			}
		}
		return isValid;
	}


	public void addCriteria(Criteria<T> criteria) {
		criteriaLists.add(criteria);
	}

	public void removeCriteria(Criteria<T> criteria) {
		criteriaLists.remove(criteria);
	}
	
	public String getMessage() {
		return message;
	}

}
