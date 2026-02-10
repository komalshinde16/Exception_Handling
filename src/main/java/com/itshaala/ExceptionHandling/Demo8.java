package com.itshaala.ExceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println("invalid denominator");
        }finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
