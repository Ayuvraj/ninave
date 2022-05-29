package InterviewProjectsdemo;

public class FactorialNum {

	public static int main(String[] args) {
		
		int num = 25, count, fact=1;
		System.out.println("Enter to find its factorial num");
		Scanf("%d","num");
		
		for(count =1; count<=num; count++)
		{
			fact=fact*count;
		}
		return 0;
		

	}

	private static void Scanf(String string, String string2) {
		
	}

}
