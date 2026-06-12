package com.adesso.gitpractict;

public class MainClass {

    public static void main(String[] args){
        System.out.println("Git Version 3");

        Calculator calculator = new Calculator();

        System.out.println("Addition   ::   "+calculator.add(20,40));

        System.out.println("Subtraction   ::   "+calculator.sub(40, 20));

        System.out.println("Subtraction   ::   "+calculator.multiply(40, 20));

        System.out.println("Divided by   ::   "+calculator.dividedby(40, 20));
    }
}
