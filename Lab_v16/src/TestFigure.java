
public class TestFigure {

	public static void main(String[] args) {


		//Figure fig = new Figure();
		//System.out.println(fig);
		
		Circle c1 = new Circle();
		c1.setColor("blue");
		//System.out.println(c1);
		
		Circle c2 = new Circle(10, 10, 20);
		//System.out.println(c2);
		
		Rectangle r1 = new Rectangle();
		//System.out.println(r1);
		
		Rectangle r2 = new Rectangle(10, 20, 100,200);
		r2.setColor("red");
		//System.out.println(r2);
		
		
		Figure f5 = new Circle();
		
		
		Figure[] figures = new Figure[5];
		
		figures[0] = fig;
		figures[1] = c1;
		figures[2] = c2;
		figures[3] = r1;
		figures[4] = r2;
		int i = 0;
		Circle c;
		for(Figure f : figures){
			
			if(f instanceof Circle)  c = (Circle)f;
			System.out.println(f);
			i++;
			
			
		}
		

	}

}
