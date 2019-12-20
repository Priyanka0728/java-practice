import java.util.Scanner;
class discount {
	public static void main(String...arg)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Price of item 1:");
		float itemPrice1=Float.parseFloat(sc.nextLine());
		System.out.println("Price of item 2:");
		float itemPrice2=Float.parseFloat(sc.nextLine());
		System.out.println("Discount in percentage");
		int discount=Integer.parseInt(sc.nextLine());
		float total=itemPrice1+itemPrice2;
		float savedAmount=(total/100)*10;
		float discountAmount=total-savedAmount;
		System.out.println("Total amount:$"+total);
		System.out.println("Discounted amount:$"+discountAmount);
	    System.out.println("savedamount:$"+savedAmount);
		}
}
		
		