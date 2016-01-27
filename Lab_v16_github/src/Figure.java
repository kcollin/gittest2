
public class Figure {

	private double x;
	private double y;
	private String color="White";
	private boolean filled=false;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Figure() {
		x = 1.0;
		y = 1.0;
	}
	
	public Figure(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Figure [x=" + x + ", y=" + y + ", color=" + color + ", filled="
				+ filled + "]";
	}

	public void test() {
		System.out.println("test");
	}

	
	
}
