package InterviewProjectsdemo;

import java.util.Scanner;

public class HCFNAnd1Cm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number: ");
		
		int num1=sc.nextInt();
		int temp1=num1;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Second number: ");
		
		int num2=sc1.nextInt();
		int temp2=num2;
		int temp,hcf,lcm;
		
		while(temp2>0)
		{
			temp=temp2;
			temp2=temp1%temp2;
			temp1=temp;
		}
		
		hcf=temp1;
		lcm=(num1*num2)/hcf;
		System.out.println("hcf of input number: "+ hcf);
		System.out.println("1cm of the input number "+ lcm);
	
	}

}
