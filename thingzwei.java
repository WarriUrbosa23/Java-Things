import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Order: ");
        String order = input.nextLine();
        input.close();
        order = order.strip();
        System.out.println(order);
        
        if (order.toLowerCase().equals("burger")) {
            System.out.println("BURGER!");
        } 
        else if (order.contains("ha")) {
            System.out.println("HA!");
        } 
        else if (order.length() > 0 && order.charAt(order.length() - 1) == 'K') {
            System.out.println("No.");
        } 
        else {
            System.out.println("Keine Ahnung");
        }
    }
}