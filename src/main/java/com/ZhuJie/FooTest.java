package com.ZhuJie;
/**
 * Created by arvin on 2018/1/20.
 */
public class FooTest {
    @MyTest
    public static void m1(){}
    public static void m2(){}
    @MyTest
    public static void m3(){
        throw new RuntimeException("Boom");
    }
    public static void m4(){}
    @MyTest
    public static void m5(){}
    public static void m6(){}
    @MyTest
    public static void m7(){
        throw new RuntimeException("Crash");
    }
    public static void m8(){}
}
