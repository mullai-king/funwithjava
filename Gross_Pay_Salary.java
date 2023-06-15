import java.util.Scanner;
class GrossPaySalary {
public static void main(String[] args){
int hours;
double payRate,daySalary,workingDays,monthSalary;

//1. Get the no of hours worked

System.out.println("How many hours did u work?");
Scanner scanner = new Scanner(System.in);
hours =scanner.nextInt();

//2. Get the hourly pay rate

System.out.println("How much your pay rate?");
payRate =scanner.nextDouble();

//3. Multiplay the hours and pay and display

daySalary = hours*payRate;
System.out.println("Salary Per Day\n" + daySalary);

//4. no of Days worked

System.out.println("How many days did u work?");
workingDays =scanner.nextDouble();

//5. Display salary per Month

monthSalary = workingDays*daySalary;
System.out.println("Salary per month\n" + monthSalary);
}
}