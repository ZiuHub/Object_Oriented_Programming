public class Main {
	public static void main (String[] args) {
		Circle circle = new Circle(7f);
		Square square = new Square(10f);
		Rectangle rectangle = new Rectangle(5f,10f);
		
		circle.calculate();
		square.calculate();
		rectangle.calculate();
	}
}
