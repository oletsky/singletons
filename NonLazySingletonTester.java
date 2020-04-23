package javatraining.oletsky.singletons;

/**
 * @author O.Oletsky
 * Demonstrating non-lazy singleton
 */

public class NonLazySingletonTester {
    public static void main(String[] args) {
        var ekz = NonLazySingleton.getInstance();
        ekz.foo();
    }
}

class NonLazySingleton {
    private static NonLazySingleton instance = new NonLazySingleton();

    private NonLazySingleton(){} //Private constructor

    public static NonLazySingleton getInstance() {
        return instance;
    }

    void foo() {
        System.out.println("It worked!");
    }
}
