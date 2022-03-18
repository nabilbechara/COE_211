import java.util.Scanner;
public class EntryPoint {
public static void main (String []args) {

int input;

	Scanner scan = new Scanner(System.in);

	System.out.println("Which service would you like to use?" + "\n" +"[1]: Basic week visualizer" + "\n" +"[2]: Advanced week visualizer" + "\n" +"[3]: Basic calculator" + "\n" +"[4]: Employee repertoire" + "\n"); 
	input = scan.nextInt();

	switch(input) {
		
		case 1:
		BasicWeek week1 = new BasicWeek();

		System.out.println(week1);
		
		break;

		case 2:
		AdvancedWeek weeka = new AdvancedWeek();
		
		System.out.println(weeka);

		break;

		case 3:
		Calculator calc1 = new Calculator();
		
		break;

		case 4:
		
		Employee employee1 = new Employee();
			
		System.out.println(employee1);

		}
	}
}
		
		
	
		
		

	