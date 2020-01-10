

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		float average;
      
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id");
		int studentId=sc.nextInt();
		System.out.println("The StudentId is "+studentId);
		System.out.println("Enter the name ");
		String name=sc.next();		
		System.out.println("The Student name is " +name);
		System.out.println("Enter Marks 1");
			int p1=sc.nextInt();			
			System.out.println("Enter Marks 2");
			int p2=sc.nextInt();			
			System.out.println("Enter Marks 3");
			int p3=sc.nextInt();			
			System.out.println("Enter Marks 4");
			int p4=sc.nextInt();
			System.out.println("Enter Marks 5");
			int p5=sc.nextInt();					
		int total = p1+p2+p3+p4+p5;		
		System.out.println("total marks is "+total);
		average=(float )total/5;
		System.out.println("Average is "+average);
		
		
		
	}
}
