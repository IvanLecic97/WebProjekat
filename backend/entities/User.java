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
	
	
}
