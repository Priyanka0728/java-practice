import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Rectangle");
        System.out.println("2.  Square");
        System.out.println("3. Circle");
        System.out.print("Area of Area Calculator --- Choose your shape");
        
        int ch = Integer.parseInt(sc.nextLine());
        ShapeH shape=null;
        
          if(ch==1) {
        	  System.out.print("Enter length: ");
              int length = sc.nextInt();
              System.out.print("Enter breadth: ");
              int breadth = sc.nextInt();
              shape=new RectangleH(length,breadth);
          }
          else if(ch==2) {
            
                System.out.print("Enter the side: ");
                int side = sc.nextInt();
                shape=new SquareH(side);
          }
          else if (ch==3) {
        	  System.out.print("Enter radius: ");
        	  int radius = sc.nextInt();
        	  shape=new CircleH(radius);
          }

       else if (ch == 4) {
                     System.out.print("Enter the side: ");
                     int side = Integer.parseInt(sc.nextLine());
                     shape = new Hexagon(side);
       }
                     

          System.out.printf("Area of %s is:%.2f",shape.getShapeName(),shape.calculateArea());
                
                
	}       
}




