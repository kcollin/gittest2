
public class Circle extends Figure {
	
	private double radius;

	public Circle() {
	//	super();
		radius = 1.0;
		// TODO Auto-generated constructor stub
	}

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getArea() {
		
		return ;
	}

	
	
}
