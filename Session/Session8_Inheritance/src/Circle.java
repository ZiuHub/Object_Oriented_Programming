public class Circle extends Geometry{
	private float radius;
	
	public Circle(float radius) {
		super();
		this.radius=radius;
	}

	@Override
	public void calculate() {
		this.area= (float) (3.14 * (radius / 2) * (radius / 2));
		this.circumference= (float) (3.14 * (radius / 2) * 2);
		System.out.println("Circle area : " + area);
		System.out.println("Circle circumference : " + circumference);
	}
	
}
