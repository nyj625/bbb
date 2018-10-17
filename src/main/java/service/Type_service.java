package service;

import java.util.List;

import entity.type;

public interface Type_service {
	public List<type> select();
	public int delete(int id);
	public int update(type t);
	
	public type selectbyId(int id);
}
