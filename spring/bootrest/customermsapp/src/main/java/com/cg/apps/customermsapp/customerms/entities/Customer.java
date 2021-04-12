package com.cg.apps.customermsapp.customerms.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Customer {

	@GeneratedValue
	@Id
	private Integer id;
	private String name;
	private int age;
	private String address;

	public Customer(){
	}
	
	
	public Customer(String name){
		this.setName(name);
	}
	
    public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		String text="id:"+id +" name-"+name;
	    return text;
	}


	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		 if(obj==null || !(obj instanceof Customer)) {
			 return false;
		 }
		 Customer that=(Customer)obj;
		return this.id==that.id;
	}
	
	
	
	
}
