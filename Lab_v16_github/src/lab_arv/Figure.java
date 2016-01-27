package lab_arv;

public class Figure {

	private double x;
	private double y;
	private String color;
	private boolean filled;
	
	public Figure() {
		x = y = 1.0;
	}

	public Figure(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Figure [x=" + x + ", y=" + y + "]";
	}

	protected double getX() {
		return x;
	}

	protected void setX(double x) {
		this.x = x;
	}

	protected double getY() {
		return y;
	}

	protected void setY(double y) {
		this.y = y;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected boolean isFilled() {
		return filled;
	}

	protected void setFilled(boolean filled) {
		this.filled = filled;
	}

}
