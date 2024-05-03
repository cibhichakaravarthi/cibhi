package Task10;

public class circle3 {
	private double radius;
	public circle3(double raduis) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getCircumference() {
		radius=2*Math.PI*radius;
		return radius;
	}

}
