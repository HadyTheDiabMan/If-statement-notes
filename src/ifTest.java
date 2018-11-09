import java.util.Scanner;

/**
 * 
 * @author Hady Diab
 * If statement notes
 *
 */
public class ifTest 
{

	public static void main(String[] args) 
	{
		/*
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter a test score: ");
		//double score = Double.parseDouble(in.nextLine());passing result directly to parse double method!, youu can put methods inside methods.
		double score=in.nextDouble(); //directly read as double data type.
		
		
		
		if (score>= 60)
		{
			System.out.println("You passed the test!!!");
			
		}
		else
		{
			System.out.println("You failed the test, good job, you're a failure..");
		}
		
		
	
		
	}

}
*/
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an age:");
		int age=in.nextInt();
		if (age < 3)
		{
			System.out.println("infant");
			
		}
		
		
		else if (age < 5)
		{
			System.out.println("todler");
			
		}
	}
	
				