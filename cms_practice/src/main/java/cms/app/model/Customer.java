package cms.app.model;


public class Customer {
	
	private int cus_id;
	private String fName;
	private String lName;
	private long contact;
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
	
	
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", fName=" + fName + ", lName=" + lName + ", contact=" + contact + "]";
	}
	public Customer(int cus_id, String fName, String lName, long contact) {
	
		this.cus_id = cus_id;
		this.fName = fName;
		this.lName = lName;
		this.contact = contact;
	}
	
	
	

}
