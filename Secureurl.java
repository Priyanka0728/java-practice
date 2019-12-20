import java.util.Scanner;
class Secureurl{
	   public static void main(String...arg) {
	      Scanner sc=new Scanner(System.in);
	
			System.out.println("Enter the String");
			String x=sc.nextLine();
						
			System.out.println("Enter the start String");
			String y=sc.nextLine();
			     if (x.startsWith(y) ) {
   		         System.out.println(x+"Start with 'https'");
				  }
				  else {
					System.out.println(x+"Dose not start with 'https'");
					}
				}
				
}