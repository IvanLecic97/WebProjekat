package services;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import entities.User;

public class regUsers {

	private HashMap<String, User> regUsersList = new HashMap<String, User>();

	public regUsers(HashMap<String, User> regUsersList) {
		super();
		this.regUsersList = regUsersList;
	}

	public HashMap<String, User> getRegUsersList() {
		return regUsersList;
	}

	public void setRegUsersList(HashMap<String, User> regUsersList) {
		this.regUsersList = regUsersList;
	}
	
	public LinkedList retRegList()
	{
		LinkedList<String> regList = new LinkedList<String>();
		for (String i : regUsersList.keySet()) {
			  regList.add(i);
			}
		return regList;
	}
	
}
