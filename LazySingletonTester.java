package javatraining.oletsky.singletons;

/**
 * @author O.Oletsky
 * Demonstrating lazy singleton
 */

public class LazySingletonTester {
    public static void main(String[] args) {
        var ekz = LazySingleton.getInstance();
        ekz.foo();
    }
}

class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){} //Private constructor

    public static LazySingleton getInstance() {
        if (instance==null) instance = new LazySingleton();
        return instance;
    }

    void foo() {
        System.out.println("It worked!");
    }
}

