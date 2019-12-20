import java.util.Scanner;
public class ProductDetails {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Product det =new Product();
	
	System.out.println("Enter product ID:");
	long id =Integer.parseInt(sc.nextLine());
	det.setId(id);
	
	System.out.println("Enter the product name:");
	det.setProductName(sc.nextLine());
	
	System.out.println("Enter the supplier name:");
    det.setSupplierName(sc.nextLine());
    
    System.out.println("Product id is:"+det.getId());
    System.out.println("Product name is:"+det.getProductName());
    System.out.println("Supplier name is:"+det.getSupplierName());
	}

}
