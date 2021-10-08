package main.java.com.tattookot.javacore;

public class Version2 {
    public static void main(String[] args) {
        Foo1 f = new Foo1();
        Thread t1 = new Thread(){
            public void run(){
                f.first(this);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                f.second(this);
            }
        };
        Thread t3 = new Thread(){
            public void run(){
                f.third(this);
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}

class Foo1 {
    public synchronized void first(Runnable r) { System.out.print("first"); }
    public synchronized void second(Runnable r) { System.out.print("second"); }
    public synchronized void third(Runnable r) { System.out.print("third"); }
}
