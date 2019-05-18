package com.yura.pav;

public class MyThread {

    private Thread[] arrayThread;
    private int numFact;
    private boolean check;

    public MyThread(int numFact) {
        super();
        this.numFact = numFact;
        this.arrayThread = new Thread[this.numFact];
    }

    public void startCompute() {
        for (int i = 0; i < arrayThread.length; i++) {
            arrayThread[i] = new Thread(new FactorialNum(i));
            arrayThread[i].start();
        }

    }
    public synchronized void printText(String text, boolean tread) {
        for (; !check == tread; ) {

            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println(text + " ");

        check = !check;
        notifyAll();
    }
}
