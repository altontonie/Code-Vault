package test;

public class ToString {
	private int day,month,year;
	
	public ToString(int d,int m,int y) {
		day = d;
		month = m; 
		year = y;
		
		System.out.printf("Default Constructors %s\n", this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", day,month,year);
	}
}
