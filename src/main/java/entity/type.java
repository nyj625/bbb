package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="type")//���ݿ������������Ǹ����Ӧ
public class type {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="parentid")//����������ж�Ӧ���ɲ�д
private int parentid;
private String name;

 @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
 @PrimaryKeyJoinColumn   //������������
 
private type_info info;
 
public type_info getInfo() {
	return info;
}
public void setInfo(type_info info) {
	this.info = info;
}
public type() {
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
