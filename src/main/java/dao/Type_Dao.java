package dao;

import java.util.List;

import entity.type;

public interface Type_Dao {
public List<type> select();

public int delete(int id);

public int update(type t);

public type selectbyId(int id);

//public void insert(type t);
}
