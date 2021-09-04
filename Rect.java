import java.util.*;
public class Rect {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int l,b;
		System.out.println("Enter the length");
		l=sc.nextInt();
		System.out.println("Enter the breadth");
		b = sc.nextInt();
		System.out.println("lenght is "+l+" breadth is "+b);
		
		if(l==b)
		{
			System.out.println("The quad is a aquare");
		}
		
		else{
			System.out.println("The quad is not a square");
		}
	}
}
