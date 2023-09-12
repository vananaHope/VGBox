package vgbox.vgboxDB.VO;

public class Seller {
	private String seller_id;
	private String password;
	private String name;
	private String address;
	private String contact;
	private String businessNum;
	private String auth;
	private String gradeName;
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(String seller_id, String password, String name, String address, String contact, String businessNum,
			String auth, String gradeName) {
		super();
		this.seller_id = seller_id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.businessNum = businessNum;
		this.auth = auth;
		this.gradeName = gradeName;
	}

	public Seller(String seller_id) {
		super();
		this.seller_id = seller_id;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBusinessNum() {
		return businessNum;
	}
	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}


}
