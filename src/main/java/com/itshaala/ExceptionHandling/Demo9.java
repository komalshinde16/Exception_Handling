package com.itshaala.ExceptionHandling;

public class Demo9 {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }
    private static int getNumber(){
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }finally {
            return 10;
        }
    }
}
