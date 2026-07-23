package com.ExceptionHandling;

import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 0;

        try {
//            divide(a,b);

            String name = "Nitesh";

            if (name.equals("Nitesh")) {
                throw new Exception("Name is Nitesh");
            }
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }finally { // always run either exception occurs or not....
            System.out.println("Runs always");
        }
    }
    static int divide(int a , int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Don't divide by zero");
        }
        return a/b;
    }
}
