package main.java.com.tattookot.javacore;

public class Version3 {

    static final Foo3 f = new Foo3();
    
    public static void main(String[] args) {
        new Thread(new C11()).start();
        new Thread(new C22()).start();
        new Thread(new C33()).start();
    }
}

class Foo3 {
    public synchronized void first(Runnable r) { System.out.print("first"); }
    public synchronized void second(Runnable r) { System.out.print("second"); }
    public synchronized void third(Runnable r) { System.out.print("third"); }
}

class C11 implements Runnable{
    @Override
    public void run(){
        Version3.f.first(this);
    }
}

class C22 implements Runnable{
    @Override
    public void run(){
        Version3.f.second(this);
    }
}

class C33 implements Runnable{
    @Override
    public void run(){
        Version3.f.third(this);
    }
}