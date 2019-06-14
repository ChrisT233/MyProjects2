package com.example.app01;

class Singleton01 {
    private static final Singleton01 ourInstance = new Singleton01();

    static Singleton01 getInstance() {
        return ourInstance;
    }

    private Singleton01() {
    }
}
