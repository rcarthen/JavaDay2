
public class AnimalMain {

	public static void main(String[] args) {

		Tiger tiger1 = new Tiger(12, 400, 4, true, 8);

		tiger1.eat();
		tiger1.move();

		System.out.println(tiger1.height + " feet tall");
		System.out.println(tiger1.hunts + " hunts viciously");
		System.out.println("Weighs " +tiger1.weight+ " lbs");
		System.out.println("This tiger has " + tiger1.offsprings + " has offsprings");
		
		
		System.out.println("------------------------------------------");
		
		
		Elephant elephant1= new Elephant (11, 13000, 5, false, "I have a trunk");
		
		elephant1.eat();
		elephant1.move();
		System.out.println(elephant1.height + " feet tall");
		System.out.println(elephant1.hunts + " does not hunt");
		System.out.println("This elephant has " + elephant1.offsprings + " offsprings");
		

	}

}
