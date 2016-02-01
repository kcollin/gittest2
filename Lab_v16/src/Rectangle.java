
public class Rectangle extends Figure {

	private double width;
	private double height;
	
	public Rectangle() {
		//super();
		height = width = 1.0;
	}

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
