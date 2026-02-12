package com.itshaala.ExceptionHandling;

public class Demo14 {
    public static void main(String[] args) {
        try{
            System.out.println(divide(100,2));
        }catch(ArithmeticException e){
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
    }

    private static int divide (int num1,int num2) throws  ArithmeticException{
        return num1/num2;
    }
}
