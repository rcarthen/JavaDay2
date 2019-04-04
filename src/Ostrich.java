
public class Ostrich extends Bird {

	public Ostrich(float height, int weight, String hasBeak, boolean canSwim, String hasWings, String laysEggs) {
		super(height, weight, hasBeak, canSwim, hasWings, laysEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Ostriches primarily eat roots, leaves, and seeds");
	}

	@Override
	public void move() {

		System.out.println("A ostrich cannot fly or swim, but they can run.");
	}

}
