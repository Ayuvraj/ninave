package InterviewProjectsdemo;

import java.util.Scanner;

public class EvenANDOdd {

	public static void main(String[] args) {
		
		
		System.out.println("FOR A PROGRAMMING EVEN AND ODD");
		
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Enter a NUMBER: ");
		int num= reader.nextInt();
		
		if(num %2==0)
		{
			System.out.println(num + " is EVEN");
		}
		else
		{
			System.out.println(num + " is ODD");
		}

	}

}
