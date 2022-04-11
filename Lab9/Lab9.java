import java.util.Scanner;
public class Lab9 {
public static void main (String[] args) {
Scanner scan = new Scanner(System.in);
int counter = 5;
int result;
int[] grade = new int[5];
int arrnum = 0;
	
	for(int num = 1; num<=counter; num++) {
	System.out.print("Input the grade of assignment " + num + ":");
	result = scan.nextInt();
	grade[arrnum] = result;
	arrnum++;
		}
double numbLab;
System.out.print("Input the number of attended labs: ");
numbLab = scan.nextDouble();

double midgrade;
System.out.print("Input the midterm grade: ");
midgrade = scan.nextDouble();

double Result1 = ((grade[0]+grade[1]+grade[2]+grade[3]+grade[4])/5.0) * 0.3 ;
double Result2 = (numbLab * 100 * 0.05) / 7;
double  Result3 = midgrade * 0.3;

System.out.println("Assignments(30%): " + Result1);
System.out.println("Attendance(5%): " + Result2);
System.out.println("Midterm(30%): " + Result3);
		
	}
}