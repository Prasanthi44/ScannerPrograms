import java.util.Scanner;
public class Sample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter empId");	
	    int empId=sc.nextInt();
	    System.out.println("please enter empName");	    
	    String name=sc.next();	   
	    System.out.println("please enter empEmail");
	    String email=sc.next();
	    
	    System.out.println("please enter empPhoneno");
	    Long Phoneno=sc.nextLong();
	    
	    System.out.println("please enter empSal");
	    float sal=sc.nextFloat();	
	    
	    System.out.println("please enter empGender");
	    String Gender= sc.next();
	    
	    System.out.println("please enter empCity");
	    String city=sc.next();
	    System.out.println("The empId is"+empId);
	    System.out.println("The empName is "+name);
	    System.out.println("The empEnail is"+email);
	    System.out.println("The empPhoneno is"+Phoneno);
	    System.out.println("The empSal is"+sal);
	    System.out.println("The empGender is"+Gender);
	    System.out.println("The empCity is"+city);
	    
	}

}
