
public class RectangleH extends ShapeH{
	private int length;
	private int breadth;
	 
	

	 public RectangleH(int length, int breadth) {
		super("Reactangle");
		this.length = length;
		this.breadth = breadth;
	}



	public  double calculateArea() {
	
	      return length * breadth;
	        
	    }
}
