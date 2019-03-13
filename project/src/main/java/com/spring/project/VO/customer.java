package com.spring.project.VO;

public class customer {
	private String customer_id; 
	private String customer_pw; 
	private String customer_name;
	private String customer_address;
	private String customer_birthdate;
	private String customer_nickname;
	private String customer_phone;
	private String customer_gender;
	private String customer_email;
	
	public customer(String customer_id, String customer_pw, String customer_name, String customer_address,
			String customer_birthdate, String customer_nickname, String customer_phone, String customer_gender,
			String customer_email) {
		super();
		this.customer_id = customer_id;
		this.customer_pw = customer_pw;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.customer_birthdate = customer_birthdate;
		this.customer_nickname = customer_nickname;
		this.customer_phone = customer_phone;
		this.customer_gender = customer_gender;
		this.customer_email = customer_email;
	}
	public customer() {
		
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_pw() {
		return customer_pw;
	}

	public void setCustomer_pw(String customer_pw) {
		this.customer_pw = customer_pw;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_birthdate() {
		return customer_birthdate;
	}

	public void setCustomer_birthdate(String customer_birthdate) {
		this.customer_birthdate = customer_birthdate;
	}

	public String getCustomer_nickname() {
		return customer_nickname;
	}

	public void setCustomer_nickname(String customer_nickname) {
		this.customer_nickname = customer_nickname;
	}

	public String getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}

	public String getCustomer_gender() {
		return customer_gender;
	}

	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", customer_pw=" + customer_pw + ", customer_name="
				+ customer_name + ", customer_address=" + customer_address + ", customer_birthdate="
				+ customer_birthdate + ", customer_nickname=" + customer_nickname + ", customer_phone=" + customer_phone
				+ ", customer_gender=" + customer_gender + ", customer_email=" + customer_email + "]";
	}
	
	
}