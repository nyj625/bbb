package hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import entity.type;
import service.Type_service;

public class test1 extends BaseTest{
@Autowired
Type_service service;
@Test
public void test() {//无参public  无返回值
	List<type> list=service.select();
	System.out.println(list.get(0).getId());
}
}
