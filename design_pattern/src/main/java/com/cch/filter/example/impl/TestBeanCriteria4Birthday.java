package com.cch.filter.example.impl;

import com.cch.filter.example.abs.AbsCriteria;
import com.cch.filter.example.bean.TestBean;

public class TestBeanCriteria4Birthday extends AbsCriteria<TestBean> {

	public boolean checkCriteria(TestBean data) {
		boolean isValid = true;
		if (data == null || data.getBirthday() == null) {
			initMessage();
			isValid = false;
		}
		return isValid;
	}
	
	@Override
	public void initMessage() {
		setMessage("birthday is requited");
	}

}
