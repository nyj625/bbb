package dao_Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import dao.Type_Dao;
import entity.type;
@Repository //º”»Î»›∆˜
public class Type_daoImpl implements Type_Dao{
	SessionFactory factory;
	
	
	public Type_daoImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}


	public List<type> select() {		
		return factory.openSession().createQuery("from type").list();
	}


	public int delete(int id) {
		String hql = "delete from type where id=?";
		Query query=factory.openSession().createQuery(hql);
		query.setInteger(0, id);
		return query.executeUpdate();
	}

//	   
//	public void insert(type t) {
//		factory.getCurrentSession().save(t);
//		
//	}
//
//
	public int update(type t) {
		  String hql = "update type set name=?,parentid=? where id=?";  
	        Query query = factory.openSession().createQuery(hql); 	       
	        query.setString(0, t.getName());  
	        query.setInteger(1, t.getParentid());  
	        query.setInteger(2, t.getId());  
	        return query.executeUpdate(); 
		
	}


	public type selectbyId(int id) {
		String hql = "from type where id=?";  
        Query query = factory.openSession().createQuery(hql);  
        query.setInteger(0, id);  
      
        return (type) query.uniqueResult();
	}

	
}
