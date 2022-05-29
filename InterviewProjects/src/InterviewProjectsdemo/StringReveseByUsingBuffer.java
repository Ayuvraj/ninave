package InterviewProjectsdemo;

public class StringReveseByUsingBuffer {

	public static void main(String[] args) {
		
		String s = "Yuvraj Madhukar Ninawe";
		
		String a,b,c;
		
		a= s.substring(0,6);
		b= s.substring(7,15);
		c= s.substring(16,22);
		
		StringBuffer A= new StringBuffer(a);
		A.reverse();
		StringBuffer B= new StringBuffer(b);
		B.reverse();
		StringBuffer C= new StringBuffer(c);
		C.reverse();
		
		System.out.println(s);
		System.out.println(A+" "+B+" "+C);
		
		
		
		
	

		

		
		
		

	}

}
