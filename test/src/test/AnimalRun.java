package test;

public class AnimalRun {
	public static void main(String[] args) {
		dogList dogs = new dogList();
		Dog d = new Dog();
		Dog d1 = new Dog();
		
		dogs.add(d);
		dogs.add(d1);
		
		System.out.println("\nAnimal array\n");
		
		//Animal animalObj = new Animal();
		Animal animalObj1 = new Dog();
		Animal animalObj2 = new Fish();
		Dog dogObj = new Dog();
		Fish fishObj = new Fish();
		
		AnimalList animalList = new AnimalList();
		//animalList.add(animalObj);
		animalList.add(animalObj1);
		animalList.add(animalObj2);
		animalList.add(dogObj);
		animalList.add(fishObj);
		
		System.out.println("\nPolymorphic Program\n");
		Animal animalObj[] = new Animal[2];
		animalObj[0] = new Dog();
		animalObj[1] = new Fish();
		
		for(Animal x: animalObj)
			x.noise();
		
	}
}
