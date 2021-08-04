package test;

public class Statics {
	private String fname;
	private String sname;
	private static int members;
	
	public Statics(String fn, String sn) {
		fname = fn;
		sname = sn;
		members++;
		
		System.out.println("name: "+fname+" "+sname+",\tMembers: "+members);
		//System.out.printf("name: %s %s,\tMembers: %d", fname,sname,members);
	}
	
	public String getFn() {
		return fname;
	}
	
	public String getSn() {
		return sname;
	}
	
	public static int getMembers() {
		return members;
	}
	
}
