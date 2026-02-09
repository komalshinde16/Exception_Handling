package com.itshaala.ExceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }finally{
            System.out.println("final block");
        }
        System.out.println("rest of the main");
    }
}
