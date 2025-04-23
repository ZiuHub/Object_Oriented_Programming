public class Square extends Geometry{
	private float side;
	public Square(float side) {
		super();
		this.side=side;
	}

	@Override
	public void calculate() {
		this.area = side * side;
		this.circumference = 4 * side;
		System.out.println("Square area : " + area);
		System.out.println("Squarecircumference : " + circumference);
	}
	
}
