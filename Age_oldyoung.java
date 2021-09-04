import java.util.*;
public class Age_oldyoung {

	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a");
	int a = sc.nextInt();
	System.out.println("enter b");
	int b = sc.nextInt();
	System.out.println("enter c");
	int c = sc.nextInt();
	
	if(a>b&&a>c)
	{
		System.out.println("A id the eldest");
	}
	else if(b>a &&b>c)
	{
		System.out.println("B is eldest ");
	}
	else 
	{
		System.out.println("C is eldest ");
	}
	
	
	if(a<b&&a<c)
	{
		System.out.println("a smallest ");
	}
	else if(b<a&&b<c)
	{
		System.out.println("b smallest ");
	}
	else if(c<a && c<b)
	{
		System.out.println("C is smallest ");
	}
	}
}
