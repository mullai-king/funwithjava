import java.util.Scanner;

public class Chatbot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Hi, I'm a chatbot. What's your name?");
        input = scanner.nextLine();
        System.out.println("Nice to meet you, " + input + "!");
        
        System.out.println("What would you like to talk about?");
        input = scanner.nextLine();
        while (!input.equals("bye")) {
            String response = generateResponse(input);
            System.out.println(response);
            input = scanner.nextLine();
        }
        System.out.println("Goodbye!");
    }
    
    public static String generateResponse(String input) {
        String response = "";
        // TODO: Implement the chatbot's response logic here.
        return response;
    }
}
