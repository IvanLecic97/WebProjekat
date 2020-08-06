package entities;

import java.awt.List;

public class User {

	private String username;
	private String password;
	private String name;
	private String surname;
	private String sex;
	private enum role{
		ADMINISTRATOR,
		HOST,
		GUEST
	}
	private String forRent;
	private String rented;
	private List resList;
	
	
	public User(String username, String password, String name, String surname, String sex, String forRent,
			String rented, List resList) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.forRent = forRent;
		this.rented = rented;
		this.resList = resList;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getForRent() {
		return forRent;
	}


	public void setForRent(String forRent) {
		this.forRent = forRent;
	}


	public String getRented() {
		return rented;
	}


	public void setRented(String rented) {
		this.rented = rented;
	}


	public List getResList() {
		return resList;
	}


	public void setResList(List resList) {
		this.resList = resList;
	}
	
	
}
