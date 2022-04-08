import java.io.*;
import java.util.Scanner;

public class Lab8 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String Name;
		String Purchase;
		double Price;
		String Decision = "yes";
		String yes = "yes";
		String answer;
		FileWriter fw = new FileWriter(new File("expenses.txt"),true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outToFile = new PrintWriter(bw);

while(Decision == yes) {
		
		System.out.print("Input your name: ");
		Name = scan.nextLine();
		
		System.out.print("What did you purchase?");
		Purchase = scan.nextLine();
		
		System.out.print("How much did you pay?(in USD)");
		Price = scan.nextDouble();
		
		scan.nextLine();

		fw.write(Name + " purchased " + Purchase + " for " + Price + " US Dollars ");
				

		System.out.println("Would you like to log another purchase?(y/n)");
		answer = scan.nextLine();
		
		switch(answer) {
		case "y":
		continue;
		
		case "n":
		Decision = answer;
		System.out.println("Get off ZoodMall!");
		

		break;
		
}
}	
fw.close();
}
}
		
		