import java.util.Scanner;

public class ParkingLotGateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = 10; 
        int occupied = 0;
        int choice;

        while (true) {
            if (occupied == capacity) {
                System.out.println("\nParking Lot is FULL!");
            }

            System.out.println("\n===== Parking Lot Menu =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("No parking slots available!");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking lot is empty!");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots: " + occupied);
                    System.out.println("Available Slots: " + (capacity - occupied));
                    break;

                case 4:
                    System.out.println("Exiting Parking System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }

            if (occupied == capacity) {
                System.out.println("\nParking lot has reached maximum capacity.");
                break;
            }
        }

        sc.close();
    }
}
