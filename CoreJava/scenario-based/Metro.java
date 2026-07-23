import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ₹");
        double balance = sc.nextDouble();

        char choice;

        do {
            if (balance <= 0) {
                System.out.println("Balance exhausted!");
                break;
            }

            System.out.print("\nEnter distance traveled (km): ");
            int distance = sc.nextInt();

            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 :
                          (distance <= 30) ? 30 : 40;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }

            System.out.print("Do you want another trip? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Delhi Metro Smart Card.");
        sc.close();
    }
}