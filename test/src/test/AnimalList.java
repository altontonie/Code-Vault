package test;

public class AnimalList {
	private Animal[] animalList = new Animal[5];
	private int i=0;
	
	public void add(Animal a) {
		if(i<animalList.length) {
			animalList[i]=a;
			System.out.println("animal added on index: "+i);
			i++;
		}
	}
	
}
