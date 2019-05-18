package com.yura.pav;

public class Main1 {
    public static void main(String[] args) {

        MyThread mr = new MyThread(100);
        mr.startCompute();
    }
}
