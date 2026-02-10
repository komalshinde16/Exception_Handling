package com.itshaala.ExceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        System.out.println(divide(100,0));
    }
    private static int divide (int num1, int num2){
        int division = -1;
        try{
            division = num1/num2;
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        return division;
    }
}
