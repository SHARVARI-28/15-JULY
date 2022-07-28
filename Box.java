
public class Box {
	private double width;
	private double height;
	private double depth;
	
	Box(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		
	}
	
	double getVolume() {
		return width * height * depth;
	}
	public static void main(String[] args) {
		
		Box box = new Box(20,30,80);
		System.out.println("The Volume is "+box.getVolume());

	}

}
