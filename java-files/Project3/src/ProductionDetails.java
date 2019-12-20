import java.util.Scanner;

public class ProductionDetails {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Productcons pc =new Productcons(1,"printer","Hp");
		
		System.out.println("Enter the Product id");
		long id=Long.parseLong(s.nextLine());
		
		System.out.println("Enter the Product Name");
		String Pname=s.nextLine();
		pc.setProductName(Pname);
		
		
		System.out.println("Enter the Supplier Name");
		String Sname=s.nextLine();
		pc.setSupplierName(Sname);
		
		pc.display();
		

	}

}
