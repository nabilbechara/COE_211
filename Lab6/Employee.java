import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

	 System.out.print("Please input the employee's first name: ");
	firstName = scan.nextLine();

	 System.out.print("Please input the employee's last name: ");
	lastName = scan.nextLine();

	System.out.print("Please input the employee's age: ");
	age = scan.nextInt();

	 System.out.print("Please input the employee's salary: ");
	salary = scan.nextDouble();
      
    }

    public String toString() {
       String output = firstName + " " + lastName + ", " + age + ", " + salary;
return output;
    }
}