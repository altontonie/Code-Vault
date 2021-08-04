 package test;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food fruits[] = new Food[2];
		fruits[0] = new Orange();
		fruits[1] = new apples();
		
		for(Food arr: fruits)
			arr.eat();
		
		System.out.println("\nPolymorphic Arguments\n");
		fatty alton = new fatty();
		//Food foodObj = new Food();
		Food orangeObj = new Orange();
		Food appleObj = new apples();
		
		//alton.digest(foodObj);
		alton.digest(orangeObj);
		alton.digest(appleObj);
		
	}
	
}
