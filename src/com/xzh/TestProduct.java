package com.xzh;


import com.xzh.dao.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(value = JUnit4.class)
public class TestProduct {
	@Test
	public void save(){
		ProductDao dao=new ProductDao();
		 dao.save();
		dao.findOne(3,"牛奶");
	 	dao.delete();
	}
}
