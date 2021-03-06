package com.cch.filter.example.impl;

import com.cch.filter.example.abs.AbsCriteria;
import com.cch.filter.example.bean.BaseBean;

public class BaseBeanCriteria4Name extends AbsCriteria<BaseBean> {

	public boolean checkCriteria(BaseBean data) {
		boolean isValid = true;
		if (data == null || data.getName() == null || data.getName().trim().length() == 0) {
			initMessage();
			isValid = false;
		}
		return isValid;
	}
	
	@Override
	public void initMessage() {
		setMessage("name is required");
	}

}
