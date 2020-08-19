package design.pattern;


import design.pattern.singleton.Singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        Singleton singleton3=Singleton.getInstance();
    }
}
