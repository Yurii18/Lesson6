package com.yura.pav;

import java.math.BigInteger;

public class FactorialNum implements Runnable {

    private int number;


    public FactorialNum(int number) {
        super();
        this.number = number;
    }

    public FactorialNum() {
    }

    public BigInteger calcFactorial(int n) {

        BigInteger fact = new BigInteger("1");

        for (int i = 1; i <= n; i++) {

            fact = fact.multiply(new BigInteger(Integer.toString(i)));

        }
        return fact;
    }

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " = " + calcFactorial(number));
    }
}