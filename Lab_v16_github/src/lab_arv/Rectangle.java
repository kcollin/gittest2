package lab_arv;

public class Rectangle extends Figure {
	
	private double width;
	private double height;
	
	public Rectangle() {
		super();
		width = 10.0;
		height = 10.0;
	}

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height
				+ ", toString()=" + super.toString() + "]";
	}

}
