import java.util.Scanner;
public class Allow_exam {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int tch,tca;
		
		System.out.print("Enter the total classes held");
		tch = sc.nextInt();
		System.out.println("Enter the classes attended");
		tca = sc.nextInt();
		double percent = ((double)tca/(double)tch)*100;
		System.out.println("Percentage of classes attended "+percent);
		
		System.out.println("Enter Y/N for medical condition");
		String med = sc.nextLine();
		
		if(percent>=75.0)
		{
			System.out.println("The student is allowed to sit for exam.");
		}
		else 
		{
			
			if(med == "y")
			{
				System.out.println("The student can sit for exam because of valid reason");
			}
			else
			{
				System.out.println("Can not sit for exam");
			}
		}
		/*
		else
		{
			System.out.println("The student can not sit for exam");
		}
		*/
	}
}

