package service_Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Type_Dao;
import entity.type;
import service.Type_service;
@Service
public class Type_serviceImpl implements Type_service{
@Autowired
Type_Dao dao;
	public List<type> select() {
	
		return dao.select();
	}
	public int delete(int id) {
		
		return dao.delete(id);
	}
	public int update(type t) {
	
		return dao.update(t);
	}
	public type selectbyId(int id) {
		// TODO Auto-generated method stub
		return dao.selectbyId(id);
	}

}
