
public class SquareH extends ShapeH {
	private int  side;

	 public SquareH(int side) {
		super("Square");
		this.side=side;
	}

	public double calculateArea() {
        double area = side * side;
        return area;
    }
}

