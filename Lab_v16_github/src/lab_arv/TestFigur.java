package lab_arv;


public class TestFigur {

	public static void main(String[] args) {
		
		Figure f1 = new Figure(10, 10);
		
		System.out.println(f1);
		
		Circle c1 = new Circle();
		
		System.out.println(c1);
		
		Rectangle r1 = new Rectangle(10,10, 200, 300);
		
		r1.setColor("red");
		r1.setFilled(true);
		
		System.out.println(r1);
		
		System.out.println("r1 farge " + r1.getColor() + " r1 fylt: " + r1.isFilled());
		
		Figure f2 = new Rectangle(10,10, 200, 300);
		
		System.out.println(f2);
	}

}
