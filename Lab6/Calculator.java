import java.util.Scanner;

public class Calculator {
	
	int num1;
	int num2;
	String Operator;
	Scanner scan= new Scanner(System.in);

	public Calculator() {
	
	System.out.println("Input the first number: ");
	num1=scan.nextInt();
	scan.nextLine();
	System.out.println("Input the operator: ");
	Operator=scan.nextLine();
	
	System.out.println("Input the second number: ");
	num2=scan.nextInt();
	
	switch (Operator) {
  case "+":
    System.out.println(add(num1, num2));
    break;
 case "-":
   System.out.println(substract(num1, num2));
    break;
  case "x":
    System.out.println(multiply(num1, num2));
 	break;
 case "/":
    System.out.println(divide(num1, num2));
 default:
	break;
}	

}
	public String add(int a, int b) {
		return "a + b=" + (a+b);
}
	public String substract(int a, int b) {
		return "a - b=" + (a-b);
}
	public String multiply(int a, int b) {
		return "a x b=" + (a*b);
}
	public String divide(int a, int b) {
		return "a / b=" + (a/b);

}
}