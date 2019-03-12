package com.lastProject.RealEstate.VO;

public class Item {
	private int forSale_Seq;
	private String enterprise_ID;
	private String forSale_Address;
	private int forSale_Rent;
	private String forSale_Picture;
	private int forSale_Deposit;
	private int forSale_Reward;
	private String forSale_Option;
	private String forSale_Subway;
	private String forSale_Indate;
	
	public Item() {
		
	}

	public Item(int forSale_Seq, String enterprise_ID, String forSale_Address, int forSale_Rent, String forSale_Picture,
			int forSale_Deposit, int forSale_Reward, String forSale_Option, String forSale_Subway,
			String forSale_Indate) {
		super();
		this.forSale_Seq = forSale_Seq;
		this.enterprise_ID = enterprise_ID;
		this.forSale_Address = forSale_Address;
		this.forSale_Rent = forSale_Rent;
		this.forSale_Picture = forSale_Picture;
		this.forSale_Deposit = forSale_Deposit;
		this.forSale_Reward = forSale_Reward;
		this.forSale_Option = forSale_Option;
		this.forSale_Subway = forSale_Subway;
		this.forSale_Indate = forSale_Indate;
	}

	public int getForSale_Seq() {
		return forSale_Seq;
	}

	public void setForSale_Seq(int forSale_Seq) {
		this.forSale_Seq = forSale_Seq;
	}

	public String getEnterprise_ID() {
		return enterprise_ID;
	}

	public void setEnterprise_ID(String enterprise_ID) {
		this.enterprise_ID = enterprise_ID;
	}

	public String getForSale_Address() {
		return forSale_Address;
	}

	public void setForSale_Address(String forSale_Address) {
		this.forSale_Address = forSale_Address;
	}

	public int getForSale_Rent() {
		return forSale_Rent;
	}

	public void setForSale_Rent(int forSale_Rent) {
		this.forSale_Rent = forSale_Rent;
	}

	public String getForSale_Picture() {
		return forSale_Picture;
	}

	public void setForSale_Picture(String forSale_Picture) {
		this.forSale_Picture = forSale_Picture;
	}

	public int getForSale_Deposit() {
		return forSale_Deposit;
	}

	public void setForSale_Deposit(int forSale_Deposit) {
		this.forSale_Deposit = forSale_Deposit;
	}

	public int getForSale_Reward() {
		return forSale_Reward;
	}

	public void setForSale_Reward(int forSale_Reward) {
		this.forSale_Reward = forSale_Reward;
	}

	public String getForSale_Option() {
		return forSale_Option;
	}

	public void setForSale_Option(String forSale_Option) {
		this.forSale_Option = forSale_Option;
	}

	public String getForSale_Subway() {
		return forSale_Subway;
	}

	public void setForSale_Subway(String forSale_Subway) {
		this.forSale_Subway = forSale_Subway;
	}

	public String getForSale_Indate() {
		return forSale_Indate;
	}

	public void setForSale_Indate(String forSale_Indate) {
		this.forSale_Indate = forSale_Indate;
	}

	@Override
	public String toString() {
		return "Item [forSale_Seq=" + forSale_Seq + ", enterprise_ID=" + enterprise_ID + ", forSale_Address="
				+ forSale_Address + ", forSale_Rent=" + forSale_Rent + ", forSale_Picture=" + forSale_Picture
				+ ", forSale_Deposit=" + forSale_Deposit + ", forSale_Reward=" + forSale_Reward + ", forSale_Option="
				+ forSale_Option + ", forSale_Subway=" + forSale_Subway + ", forSale_Indate=" + forSale_Indate + "]";
	}
	
	
}
