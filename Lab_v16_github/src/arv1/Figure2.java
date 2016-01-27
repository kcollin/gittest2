package arv1;

public class Figure2 {

	private double x;
	private double y;
	
	public Figure2() {
		x = 1.0;
		y = 1;
		
	}
	public Figure2 (double x, double y){
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
		return "Figure1 [x=" + x + ", y=" + y +  "]";
	}

}
