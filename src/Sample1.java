

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
			int s1=sc.nextInt();			
			System.out.println("Enter Marks 2");
			int s2=sc.nextInt();			
			System.out.println("Enter Marks 3");
			int s3=sc.nextInt();			
			System.out.println("Enter Marks 4");
			int s4=sc.nextInt();
			System.out.println("Enter Marks 5");
			int total=s1+s2+s3+s4;
		System.out.println("total marks is "+total);
		average=(float )total/5;
		System.out.println("Average is "+average);
		System.out.println("Average is "+average);
		System.out.println("Average is "+average);
		
		
	}
}
