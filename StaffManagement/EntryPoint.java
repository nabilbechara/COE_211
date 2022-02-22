import java.util.Scanner;
public class EntryPoint {
	public static void main(String[]args) {
		
		Scanner scan= new Scanner(System.in);
		
		String FirstName;
		System.out.println("Please input the employee's first name: ");
		FirstName=scan.nextLine();
		
		String LastName;
		System.out.println("Please input the employee's last name: ");
		LastName=scan.nextLine();
		
		int Age;
		System.out.println("Please input the employee's age: ");
		Age=scan.nextInt();
		
		double Sallary;
		System.out.println("Please input the employee's monthly sallary: ");
		Sallary=scan.nextFloat();
		
		Employee employee1 = new Employee(FirstName,LastName,Age,Sallary);
		System.out.println("Employee information: " + employee1);
	}
}
		

	
		