import java.util.Scanner;

public class CalculatorApp {
	Scanner scan=new Scanner(System.in);
	void add(){
		System.out.println("Enter two number for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	void sub(){
		System.out.println("Enter two number for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Subtraction of "+a+" from "+b+" is "+(a-b));
	}
	void mul(){
		System.out.println("Enter two number for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	}
	void div(){
		System.out.println("Enter two number for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Division of "+a+" by "+b+" is "+(a/b));
	}
	void mod(){
		System.out.println("Enter two number for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("modulus of "+a+" by "+b+" is "+(a%b));
	}
	void square(){
		System.out.println("Enter two number for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Square of "+a+" is "+(a^2));
	}


}
