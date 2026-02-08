package com.itshaala.ExceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("rest of the try");
        } catch (NullPointerException npe) {
            System.out.println("NPE");
        }catch (ArithmeticException arithmeticException){
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
    }
}
