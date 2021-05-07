package Odev5_ETicaret.entities.concretes;

import Odev5_ETicaret.entities.abstracts.Entity;

public class Customer implements Entity {
	 private int id;
	 private String name;
	 private String surName;
	 private String eMail;
	 private String password;
	 
	public Customer() {}

	public Customer(int id, String name, String surName, String eMail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.eMail = eMail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
