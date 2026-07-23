import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;

        int gradeCode;
        if (average >= 90)
            gradeCode = 1;
        else if (average >= 75)
            gradeCode = 2;
        else if (average >= 60)
            gradeCode = 3;
        else if (average >= 40)
            gradeCode = 4;
        else
            gradeCode = 5;

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        System.out.print("Grade = ");
        switch (gradeCode) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

        sc.close();
    }
}
