package main.java.com.tattookot.javacore;

import java.util.concurrent.Semaphore;

public class Semaphore1 {

    static final FooSem f = new FooSem();

    public static void main(String[] args) {
        new Thread(new CS1()).start();
        new Thread(new CS2()).start();
        new Thread(new CS3()).start();
    }
}

class FooSem {
    private final Semaphore sem = new Semaphore(1);

    public void first(Runnable r) {
        try {
            sem.acquire();
            System.out.print("first");
        } catch (InterruptedException e) {
            System.out.println("Exception in first: " + e.getMessage());
        }
        sem.release();

    }
    public void second(Runnable r) {
        try {
            sem.acquire();
            System.out.print("second");
        } catch (InterruptedException e) {
            System.out.println("Exception in second: " + e.getMessage());
        }
        sem.release();
    }
    public void third(Runnable r) {
        try {
            sem.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            System.out.println("Exception in third: " + e.getMessage());
        }
        sem.release();

    }
}

class CS1 implements Runnable{
    @Override
    public void run(){
        Semaphore1.f.first(this);
    }
}

class CS2 implements Runnable{
    @Override
    public void run(){
        Semaphore1.f.second(this);
    }
}

class CS3 implements Runnable{
    @Override
    public void run(){
        Semaphore1.f.third(this);
    }
}