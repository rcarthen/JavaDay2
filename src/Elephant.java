
public class Elephant extends Animal {
	
	String hastrunk;

	public Elephant(float height, int weight, int offsprings, boolean hunts, String hastrunk) {
		super(height, weight, offsprings, hunts);
		this.hastrunk = hastrunk;
	}
	
	
	@Override
	public void eat() {
		System.out.println("Elephants are herbivores.");
	}


	@Override
	public void move() {
		
		System.out.println("Elephants roam around.");
	}


}
