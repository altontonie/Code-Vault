package test;

public class tuna {
	private String name;
	private ToString birthday;
	
	public tuna(String theName, ToString theBirthday) {
		name = theName;
		birthday = theBirthday;
		
	}
	
	public String toString() {
		return String.format("my name is %s, my bdae is %s", name, birthday);
	}
}
