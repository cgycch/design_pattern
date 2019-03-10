package com.cch.filter.interf;

import java.util.List;

import com.cch.filter.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
