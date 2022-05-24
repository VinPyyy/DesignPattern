package com.vinpyyy.priciple.liskov.improve;

/**
 * @author VinPyyy
 * @create 2022/5/24 21:33
 */
public class Liskov {

    public static void main(String[] args) {
        System.out.println(new A().subtract(2, 1));
        System.out.println(new B().subtract(2, 1));
        System.out.println(new B().subtractA(2, 1));
    }

}

// 创建一个更加基础的基类
class Base {
    // 把更加基础的方法和成员写到Base类中
}

class A extends Base {

    public int subtract(int a, int b) {
        return a - b;
    }

}

class B extends Base {

    // 如果B需要使用A类的方法，使用组合关系
    private final A a = new A();

    public int subtract(int a, int b) {
        return a + b;
    }

    public int subtractA(int a, int b) {
        return this.a.subtract(a, b);
    }

}
