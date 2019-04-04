
public class Tiger extends Animal {

	private int runningSpeed;

	public Tiger(float height, int weight, int offsprings, boolean hunts, int runningSpeed) {
		super(height, weight, offsprings, hunts);
		this.runningSpeed = runningSpeed;
	}

	public int getRunningSpeed() {
		return runningSpeed;
	}

	public void setRunningSpeed(int runningSpeed) {
		this.runningSpeed = runningSpeed;
	}

	public void eat() {
		System.out.println("A tiger is a carnivore");
	}

	@Override
	public void move() {

		System.out.println("This animal runs quickly");
	}

}
