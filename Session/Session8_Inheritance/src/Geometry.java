public abstract class Geometry {
	public float area;
	public float circumference;
	
	public Geometry() {
		System.out.println("This is geometry");
	}
	
	public abstract void calculate();
}
