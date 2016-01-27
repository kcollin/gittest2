package arv1;

public class Rectangle2 extends Figure2 {

	private double width;
	private double height;
	
	public Rectangle2() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle2(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle2 [getX()=" + getX() + ", getY()=" + getY()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
