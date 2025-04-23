public class Rectangle extends Geometry{
	private float width;
	private float length;
	

	public Rectangle(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}


	@Override
	public void calculate() {
		this.area = (float)(width*length);
		this.circumference = (float)(2 * width + 2 * length);
		System.out.println("Rectangle area : " + area);
		System.out.println("Rectangle circumference : " + circumference);
		
	}

}
