package com.itshaala.ExceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try{
            String str = "null";
            System.out.println(str.length());
            System.out.println(10/0);
            int [] array = {};
            System.out.println(array[0]);
        }catch(ArithmeticException ae){
            System.out.println("invald denominator");
        }catch(NullPointerException npe){
            System.out.println("null pointer");
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("invalid index");
        }
    }
}
