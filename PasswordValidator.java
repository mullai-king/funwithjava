import java.util.Scanner;
class PasswordValidator{
	
	private static String username = "johndoe";
	private static String password = "ABC_1234";
	
	public static void main(String[] args){
		passwordRules();
		Scanner scanner = new Scanner(System.in);
		String newPassword;
		boolean valid;
		do{
		//Get the new password
		System.out.println("Enter the new password:");
		newPassword = scanner.nextLine();
		valid = passwordValidation(newPassword);
		}
		while(!valid);
		System.out.println("Your Password accepted");
		
	}
	public static void passwordRules(){
		System.out.println("Password must have 8 letters of character");
		System.out.println("Password must have uppercase ");
		System.out.println("Password must have special character");
		System.out.println("Password doesn't contains username");
		System.out.println("Not contain oldPassword");
	}
	public static boolean passwordValidation(String newPassword){
		boolean valid =true;
		String errorMessage ="";
		//validate the password contains min 8 character
		if(newPassword.length() <8){
			valid =false;
			System.out.println("your Password must have 8 letters of character.");
		}
		//Validate the newPassword contains uppercase
		if(newPassword.equals(newPassword.toLowerCase())){
			valid = false;
			System.out.println("Your Password must have uppercase.");
		}
		//Validate the newPassword contains special character
		if(newPassword.matches("[a-zA-Z0-9]*")){
			valid = false;
			System.out.println("your Password must have special character.");
		}
		//Validate the doesn't newPassword contains oldPassword
		if(newPassword.equals(password)){
			valid = false;
			System.out.println("Your Password must be different.");
		}
		//Validate the newPassword contains username
		if(newPassword.toUpperCase().contains(username.toUpperCase())){
			valid = false;
			System.out.println("Your Password contains username");
		}
		
		return valid;
		
	}
}