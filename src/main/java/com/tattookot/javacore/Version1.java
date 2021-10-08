package main.java.com.tattookot.javacore;

public class Version1 {

    static final Foo f = new Foo();
    
    public static void main(String[] args) {
        
        C1 c1 = new C1();
        C2 c2 = new C2();
        C3 c3 = new C3();

        c1.start();
        c2.start();
        c3.start();
    }
}
class Foo {
    public synchronized void first(Runnable r) { System.out.print("first"); }
    public synchronized void second(Runnable r) { System.out.print("second"); }
    public synchronized void third(Runnable r) { System.out.print("third"); }
}

class C1 extends Thread{
    @Override
    public void run(){
        Version1.f.first(this);
    }
}class C2 extends Thread{
    @Override
    public void run(){
        Version1.f.second(this);
    }
}class C3 extends Thread{
    @Override
    public void run(){
        Version1.f.third(this);
    }
}