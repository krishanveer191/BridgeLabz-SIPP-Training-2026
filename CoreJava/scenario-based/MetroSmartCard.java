import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        double balance = sc.nextDouble();

        char choice = 'y';

        while (balance > 0 && (choice == 'y' || choice == 'Y')) {

            System.out.print("\nEnter distance traveled (in km): ");
            int distance = sc.nextInt();

            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 :
                          (distance <= 25) ? 30 : 40;

            if (balance >= fare) {
                balance -= fare;

                System.out.println("Fare Deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient Balance!");
                break;
            }

            if (balance > 0) {
                System.out.print("Do you want to travel again? (y/n): ");
                choice = sc.next().charAt(0);
            }
        }

        System.out.println("\nSession Ended.");
        System.out.println("Final Balance: ₹" + balance);

        sc.close();
    }
}