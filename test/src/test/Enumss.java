package test;

public enum Enumss {
	alton("pycho","25"),
	ivy("understanding","20"),
	kayla("crazy","4"),
	barbuz("mom","57"),
	edwin("dad","31"),
	george("student","22");
	
	private String desc;
	private String age;
	
	Enumss(String theDesc, String theAge) {
		// TODO Auto-generated constructor stub
		desc = theDesc;
		age = theAge;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getAge() {
		return age; 
	}
	
}
