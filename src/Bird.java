
public abstract class Bird extends Creatures implements CreatureInterface {

protected String hasBeak;
protected boolean canSwim;
protected String hasWings;
protected String laysEggs;


	public Bird(float height, int weight, String hasBeak, boolean canSwim, String hasWings, String laysEggs) {
	super(height, weight);
	this.hasBeak = hasBeak;
	this.canSwim = canSwim;
	this.hasWings = hasWings;
	this.laysEggs = laysEggs;
}
	
	

	public String getHasBeak() {
		return hasBeak;
	}



	public void setHasBeak(String hasBeak) {
		this.hasBeak = hasBeak;
	}



	public boolean isCanSwim() {
		return canSwim;
	}



	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}



	public String getHasWings() {
		return hasWings;
	}



	public void setHasWings(String hasWings) {
		this.hasWings = hasWings;
	}



	public String getLaysEggs() {
		return laysEggs;
	}



	public void setLaysEggs(String laysEggs) {
		this.laysEggs = laysEggs;
	}



	@Override
	public void eat() {
		System.out.println("This bird eats seeds");
	}
	
	@Override
	public void move() {
		
		System.out.println("I can fly high");
	}

	
	
}
