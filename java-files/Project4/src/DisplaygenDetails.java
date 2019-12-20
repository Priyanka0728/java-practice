import java.util.Scanner;
public class DisplaygenDetails {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	   Displaygen n= new Displaygen(969143,"John");
	   Displaygen n1= new Displaygen(969144,"Priya");
	   
	   System.out.println("Enter the number of GenCs");
	   int gen=Integer.parseInt(sc.nextLine());
	   
	   for(int i=0;i<gen;i++) {
		   System.out.println("Enter Employee Id");
		   int empId=Integer.parseInt(sc.nextLine());
		   n.setEmpId(empId);
		   
		   System.out.println("Enter name");
		   String name=sc.nextLine();
		   n1.setName(name);
		   
		   }
	   n.display();
	   n1.display();
	}

}
