package InterviewProjectsdemo;

public class Factorial_Number {

	public static void main(String[] args) {
		
		int num=30;
		long factorial=1;
		for (int i=1; i<=num; ++i)
		{
			factorial = factorial*i;
			factorial*=i;
		}
		System.out.printf("factorial of %d=%d",num,factorial);

	}

}
