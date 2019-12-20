import java.util.Scanner;
class Dayofweeknew {
	public static void main(String...arg) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the day number");
		int i = Integer.parseInt(sc.nextLine());
		String[] a=new String[8];
		a[0] = "";
		a[1] = "Sun";
		a[2] = "Mon";
		a[3] = "Tue";
		a[4] = "Wed";
		a[5] = "Thur";
		a[6] = "Fri";
		a[7] = "Sat";
		for(;i<a.length;) {
			System.out.println("Day of the week is "+a[i]);
			break;
		}
	}
}
		