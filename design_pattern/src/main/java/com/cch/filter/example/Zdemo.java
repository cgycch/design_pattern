package com.cch.filter.example;

import com.cch.filter.example.bean.BaseBean;
import com.cch.filter.example.bean.TestBean;
import com.cch.filter.example.impl.BaseBeanCriteria4Name;
import com.cch.filter.example.impl.BaseBeanCriteria4Pass;
import com.cch.filter.example.impl.TestBeanCriteria4Birthday;

public class Zdemo {

	public static void main(String[] args) {

		 baseBeanTest();
		//testBeanTest();

	}

	public static void testBeanTest() {
		TestBean data = new TestBean();

		CriteriaFilers<TestBean> myCriterias = new CriteriaFilers<TestBean>();
		myCriterias.addCriteria(new TestBeanCriteria4Birthday());

		if (!myCriterias.validate(data)) {
			throw new RuntimeException(myCriterias.getMessage());
		} else {
			System.out.println("data is valid");
		}
	}

	public static void baseBeanTest() {
		BaseBean data = generateMockBaseBean();
		CriteriaFilers<BaseBean> myCriterias = generateFilters();

		if (!myCriterias.validate(data)) {
			throw new RuntimeException(myCriterias.getMessage());
		} else {
			System.out.println("data is valid");
		}
	}

	public static BaseBean generateMockBaseBean() {
		BaseBean data = new BaseBean();
		data.setName("admin");
		data.setPass("123");
		return data;
	}

	public static CriteriaFilers<BaseBean> generateFilters() {
		CriteriaFilers<BaseBean> myCriterias = new CriteriaFilers<BaseBean>();
		myCriterias.addCriteria(new BaseBeanCriteria4Name());
		myCriterias.addCriteria(new BaseBeanCriteria4Pass());
		return myCriterias;
	}

}
