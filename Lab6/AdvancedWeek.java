public class AdvancedWeek {

	String day1="Monday";
	
	String day2="Tuesday";

	String day3="Wednesday";

	String day4="Thursday";

	String day5="Friday";

	String day6="Saturday";

	String day7="Sunday";
	
	int a=1;
	public AdvancedWeek() {
	}
	public String toString()  {
	String output = a+"."+day1+"\n"+(a+1)+day2+"\n"+(a+2)+"."+day3+"\n"+(a+3)+"."+day4+"\n"+(a+4)+"."+day5+"\n"+(a+5)+"."+day6+"\n"+(a+6)+"."+day7;
	return output;	
	}
}