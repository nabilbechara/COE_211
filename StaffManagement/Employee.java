public class Employee {

String FirstName;
String LastName;
int Age;
double Sallary;	

	public Employee( String FirstName,String LastName,int Age,double Sallary) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Age=Age;
		this.Sallary=Sallary;
}

	public String toString() {
		String output= FirstName + " " + LastName + ", " + Age + ", " + Sallary;
		return output;
	}

}
				