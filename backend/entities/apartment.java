package entities;

import java.util.List;

public class apartment {

	private enum type
	{
		APARTMENT,
		ROOM
	}
	private int roomNum;
	private int guestNum;
	private String location;
	private String date;
	private List<String> freeDates;
	private String host;
	private String comments;
	private String pics;
	private int price;
	private String time;
	private String leavingTime;
	private enum status
	{
		ACTIVE,
		INACTIVE
	}
	private class Amneities
	{
		int id;
		List<String> name;
	}
	private List<String> reservations;
	
	
	public apartment(int roomNum, int guestNum, String location, String date, List<String> freeDates, String host,
			String comments, String pics, int price, String time, String leavingTime, List<String> amneities,
			List<String> reservations) {
		super();
		this.roomNum = roomNum;
		this.guestNum = guestNum;
		this.location = location;
		this.date = date;
		this.freeDates = freeDates;
		this.host = host;
		this.comments = comments;
		this.pics = pics;
		this.price = price;
		this.time = time;
		this.leavingTime = leavingTime;
		this.reservations = reservations;
	}


	public int getRoomNum() {
		return roomNum;
	}


	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}


	public int getGuestNum() {
		return guestNum;
	}


	public void setGuestNum(int guestNum) {
		this.guestNum = guestNum;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public List<String> getFreeDates() {
		return freeDates;
	}


	public void setFreeDates(List<String> freeDates) {
		this.freeDates = freeDates;
	}


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getPics() {
		return pics;
	}


	public void setPics(String pics) {
		this.pics = pics;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getLeavingTime() {
		return leavingTime;
	}


	public void setLeavingTime(String leavingTime) {
		this.leavingTime = leavingTime;
	}


	


	public List<String> getReservations() {
		return reservations;
	}


	public void setReservations(List<String> reservations) {
		this.reservations = reservations;
	}
	
	
}
