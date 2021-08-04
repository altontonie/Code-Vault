package test;
import java.util.EnumSet;

public class test {
	public static void main(String args[]) {
		for(Enumss people: Enumss.values()) {
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getAge());
		}
		
		System.out.println("\nThis is the range!!!\n");
		
		for(Enumss people: EnumSet.range(Enumss.ivy, Enumss.edwin)) {
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getAge());
		}
	}
}
 