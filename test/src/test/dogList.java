package test;

public class dogList {
	
	private Dog[] theList = new Dog[5];
	private int i = 0;
	
	public void add(Dog d) {
		if(i<theList.length) {
			theList[i] = d;
			System.out.println("object added on index: "+i);
			i++;
		}
	}
	
}
