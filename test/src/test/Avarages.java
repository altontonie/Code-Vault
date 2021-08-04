package test;

public class Avarages {
	public static void main(String[] args) {
		System.out.println(average(4,54,5,5,56,88,456));
	}
	
	public static int average(int...numbers) {
		int total=0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
}
