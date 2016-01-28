

public class TestFigur {

	public static void main(String[] args) {
		
		Figure fig1 = new Circle(10.0,10.0, 7);
		//System.out.println(fig1);
		Circle c1 = new Circle(20, 20, 4.0);
		
		//System.out.println(c1);
		
		Rectangle r1 = new Rectangle(30,30,10,10);
		r1.setColor("Red");
		r1.setFilled(true);
		
		//System.out.println(r1);
		
		
		Figure[] figs = new Figure[7];
		
		figs[0] = fig1;
		figs[1] = new Circle(10,10, 2);
		figs[2] = new Rectangle();
		figs[3] = new Rectangle(10,10, 10, 10);
		figs[4] = c1;
		figs[5] = new Rectangle(10,50, 100, 100);
		figs[6] = new Rectangle(10,50, 999, 999);
		for (Figure f1 : figs) {
			
			System.out.println(f1);
		}
	}

}
