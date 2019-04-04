
public class Wren extends Bird {
	
	
	private double flyingAltitude;

	public Wren(float height, int weight, String hasBeak, boolean canSwim, String hasWings, String laysEggs,
			double flyingAltitude) {
		super(height, weight, hasBeak, canSwim, hasWings, laysEggs);
		this.flyingAltitude = flyingAltitude;
	}

	public double getFlyingAltitude() {
		return flyingAltitude;
	}

	public void setFlyingAltitude(double flyingAltitude) {
		this.flyingAltitude = flyingAltitude;
	}

	

	@Override
	public void eat() {
		System.out.println("A wren primarily eats insects");
	}
	
	@Override
	public void move() {
		
		System.out.println("A wren can fly high & swim");
	}

	
	public void fly () {
	
		
		System.out.println("Wrens can fly " + this.flyingAltitude + " ft high");
	}

	
}
	
	







	








