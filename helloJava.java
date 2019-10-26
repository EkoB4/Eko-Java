import java.io.BufferedReader;
import java.io.InputStreamReader;

public class helloJava {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String order, again;
        int quantity;
        double price1 = 0, price2 = 0;
        int loop1 = 0;
        int quantity1, quantity2 = 0;

        System.out.println("  ");

        System.out.println("Welcome to the cinemas!");

        System.out.println(" ");
        System.out.println("MAIN MENU");
        System.out.println(" ");
        System.out.println("The cinema has the following options");
        System.out.println(" ");
        System.out.println("1 = Child (4-5 yrs)");
        System.out.println("2 = Adult (18+ yrs)");
        System.out.println("3 = Senior (60+ yrs)");

        do {
            System.out.println(" ");
            System.out.print("Enter your option: ");
            order = br.readLine();
            if (order.equalsIgnoreCase("1")) {
                price1 = 18.0;
            } else if (order.equalsIgnoreCase("2")) {
                price1 = 36.0;
            } else if (order.equalsIgnoreCase("3")) {
                price1 = 32.5;
            }

            System.out.print("Enter the number of tickets: ");
            quantity1 = Integer.parseInt(br.readLine());
            quantity2 = quantity1 + quantity2;

            price2 = price1 * quantity2;
            System.out.println(
                    "You are purchasing " + order + " number of tickets at " + quantity2 + " quantity");

            System.out.print("Do you wish to continue?  (Y/N) : ");
            again = br.readLine();
            if (again.equalsIgnoreCase("y"))
                loop1 = loop1 + 1;
            else
                loop1 = loop1 - 100;
        } while (loop1 == 1);

        System.out.println(" ");

        System.out.printf("Total Price           : $%.2f", price2);

    }
}