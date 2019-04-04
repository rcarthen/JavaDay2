
public class BirdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ostrich ostrich1 = new Ostrich(6, 200, "I have a beak", false, "Ostriches have wings", "Ostriches lay eggs");
		ostrich1.eat();
		ostrich1.move();
		System.out.println(ostrich1.hasWings);
		System.out.println(ostrich1.laysEggs);

		System.out.println("-----------------------------------------------------");

		Wren wren1 = new Wren(1, 2, "I have a beak", true, "Wrens have wings", "Wrens lay eggs", 200);
		wren1.eat();
		wren1.move();
		wren1.fly();
		System.out.println(wren1.hasWings);
		System.out.println(wren1.laysEggs);

	}

}
