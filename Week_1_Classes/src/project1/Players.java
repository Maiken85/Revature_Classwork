package project1;

public class Players {
	
	private String fname;
	private String lname;
	private int age;
	private int id;
	private int sex;
	private String mf;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMf() {
		return mf;
	}
	public void setMf(String mf) {
		this.mf = mf;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	

	public void printPlayer() {
		System.out.println("Player "+(id+1)+"'s id number...: "+id);
		System.out.println("Player "+(id+1)+"'s First Name..: "+fname);
		System.out.println("Player "+(id+1)+"'s Last Name...: "+lname);
		System.out.println("Player "+(id+1)+"'s Age.........: "+age);
		System.out.println("Player "+(id+1)+"'s Sex.........: "+mf+"\n\n");
		
	}
}
