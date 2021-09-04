import java.util.*;
public class Discount {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int q;
		System.out.println("Enter the quantity");
		q  = sc.nextInt();
		
		if((q*100)>1000)
		{
			System.out.println("Discount is "+0.1*q*100+" And the total cost will be "+0.9*q*100);
		}
		else
		{
			System.out.println("No discount offered by the shop");
			
		}
	}
}
