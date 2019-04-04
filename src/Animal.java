
///should be an abstract class or interface 
public abstract class Animal extends Creatures {
	
	protected int offsprings;
	protected boolean hunts;

	
public Animal(float height, int weight, int offsprings, boolean hunts) {
		super(height, weight);
		this.offsprings = offsprings;
		this.hunts = hunts;
	}


public int getOffsprings() {
	return offsprings;
}


public void setOffsprings(int offsprings) {
	this.offsprings = offsprings;
}


public boolean isHunts() {
	return hunts;
}


public void setHunts(boolean hunts) {
	this.hunts = hunts;
}

	public void eat() {
		System.out.println("This animal is a carnivore");
	}

	public void move() {

		System.out.println("This animal walks");
	}
	
}
