package PRP;

public class Box {
	private double height;
	private double width;
	private double depth;
	

	public Box(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
    public  double Volume()
    {
    	double v;
    	v=height*width*depth;
		return v;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(8.4,5.6,4.7);
		System.out.println(b.Volume());

	}

}
