package com.company.singleton;

public class Singleton {
    private static final Singleton sInstance = new Singleton();

    //생성자를 private으로 함으로써 다른 파일에서 new로 할수없고, getInstance로 하나의 인스턴스만
    //얻을 수 있다. 하나만 인스턴스가 있는것.
    private Singleton() {

    }
    public static Singleton getInstance() {
        return sInstance;
    }
}
