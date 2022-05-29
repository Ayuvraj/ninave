package InterviewProjectsdemo;

import java.util.Scanner;

public class Practiselogic {

	public static void main(String[] args) {
		
		String a ="Yuvraj";
		
		System.out.println(a.indexOf('Y'));
		System.out.println(a.indexOf('u'));
		System.out.println(a.indexOf('r'));
		System.out.println(a.indexOf('j'));
		System.out.println("--------------------------------");
		
		String b = "Pooja";
		
		System.out.println(b.lastIndexOf(a));
		System.out.println(b.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(b.concat(" Jitendra ninawe"));
		System.out.println("----------------------------------");
		
		String c= "Yuvraj";
		
		StringBuffer s= new StringBuffer(c);
		s.reverse();
		System.out.println(""+s);
		System.out.println("----------------------------------");
		
		
		
		



	}

}
