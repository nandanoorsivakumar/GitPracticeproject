package com.adesso.gitpractict;

import static java.lang.Math.round;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double dividedby(int a, int b){
        return a/b;
    }

    public double squareroot(int a){
        return round(a * a);
    }
}
