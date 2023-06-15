import java.util.Scanner;
class Challenge {
public static void main(String[] args){
int number;
String adjective,season;
//1.scan and store the values
System.out.println("Enter season of the yaear");
Scanner scanner = new Scanner(System.in);
season =scanner.next();
System.out.println("Enter the whole no");
number =scanner.nextInt();
System.out.println("Enter the whole Adjective");
adjective =scanner.next();
//2.print like fill thee blanks
System.out.println("On a " + adjective +" "+ season + " day,i drink minimum of " + number + " coffees");
}
}