package com.cch.filter;

import java.util.ArrayList;
import java.util.List;

import com.cch.filter.interf.Criteria;

public class CriteriaFemale implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
