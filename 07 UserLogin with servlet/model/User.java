package model;

import java.util.Objects;

public class User {
	
	private String name;
	private long mobile;
	private double wallet;
	
	
	
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, long mobile, double wallet) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "\nname=" + name + "\nmobile=" + mobile + "\nwallet=" + wallet ;
	}
	
	
	

}
