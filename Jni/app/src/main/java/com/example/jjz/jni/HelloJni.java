package com.example.jjz.jni;

public class HelloJni {
    static {
        System.loadLibrary("hello");
    }

    public native int sayHello(int a);

}
