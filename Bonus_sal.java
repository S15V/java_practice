import java.util.*;
public class Bonus_sal {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int sal,yoe;
		System.out.println("Enter the sal");
		sal = sc.nextInt();
		System.out.println("Enter year of exp");
		yoe = sc.nextInt();
		
		if(yoe>5)
		{
			
			double bonus =(0.05*sal);
			System.out.println("The net bonus amount is "+bonus);
		}
	}
}
