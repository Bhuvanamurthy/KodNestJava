import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CalculatorApp c1=new CalculatorApp();
		System.out.println("Hello user welcome KodNest Calculator");
		System.out.println("+====>Addition");
		System.out.println("-====>Subtraction");
		System.out.println("*====>Multiplication");
		System.out.println("/====>Division");
		System.out.println("%====>Modulus");
		System.out.println("^====>FindRemainder");
		System.out.println("!------>Stop");
		System.out.println("Enter the choice");
		char ch=scan.next().charAt(0);
		
		switch(ch)
		{
		case '+':c1.add();
		         break;
			
		case '-':c1.sub();
		         break;
			
		case '*':c1.mul();
		         break;
		         
			
		case '/':c1.div();
		         break;
		         
			
		case '%':c1.mod();
		         break;
		          
		case '^':c1.square();
		         break;
			
		case '!':System.out.println("tata bye bye see you");
		return;
		}
		
		
		
		
	}

}
