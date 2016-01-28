
public class Rectangle extends Figure {

	private double width;
	private double height;
	
	public Rectangle() {
		height = 1.0;
		width = 1.0;
		
	}

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle: width: " + width + " height " + height + " " + super.toString();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
}
