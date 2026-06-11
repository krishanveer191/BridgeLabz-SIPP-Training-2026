


import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

 
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        
        if (number2 != 0) {
            double division = number1 / number2;
            System.out.println(
                "The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division
            );
        } else {
            System.out.println(
                "The addition, subtraction, and multiplication value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", and " + multiplication
                + ". Division is not possible by zero."
            );
        }

        sc.close();
    }
}

