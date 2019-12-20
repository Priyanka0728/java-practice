
public class CircleH extends ShapeH {
	private int radius;
	
	 public CircleH(int radius) {
			super("Circle");
			this.radius = radius;
			
		}


	public double calculateArea() {
	        double area = Math.PI * radius * radius;
	        return area;
	    }

}
