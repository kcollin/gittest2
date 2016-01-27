package lab_arv;

public class Circle extends Figure{

	private double radius;
	
	public Circle() {
		super();
		radius = 1;
		
	}
	public Circle(double x, double y, double radius) {
		super(x ,y);
		this.radius = radius;

	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString()
				+ "]";
	}


}
