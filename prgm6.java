import java.util.Scanner;
class Compinteger {
	
	public static void main(String...arg)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter he first number");
	int first=Integer.parseInt(sc.nextLine());
	System.out.println("Enter second number");
	int second=Integer.parseInt(sc.nextLine());
	
	if(first<second) {
		System.out.println(first+"is less than"+second);
	}
	else if(first==second) {
		System.out.println(first+"is equal to"+second);
	}
	else if(first>second) {
		System.out.println(first+"is greater than"+second);
	}
	else {
		System.out.println("enter number");
	}
    }
}
