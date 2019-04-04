
public abstract class Creatures implements CreatureInterface {
	
		protected float height;
		protected int weight;
		public Creatures(float height, int weight) {
			super();
			this.height = height;
			this.weight = weight;
		}
		public float getHeight() {
			return height;
		}
		public void setHeight(float height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		


}
