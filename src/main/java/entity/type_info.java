package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="type_info")//���ݿ������������Ǹ����Ӧ
public class type_info {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="parentid")//����������ж�Ӧ���ɲ�д
private int parentid;
private String name;



public type_info() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getParentid() {
	return parentid;
}
public void setParentid(int parentid) {
	this.parentid = parentid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
