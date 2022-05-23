package com.vinpyyy.priciple.segregation.improve;

/**
 * @author VinPyyy
 * @create 2022/5/23 8:40
 */
public class Segregation2 {



}

interface interface1 {

    void operation1();

}

interface interface2 {

    void operation2();

    void operation3();

}

interface interface3 {

    void operation4();

    void operation5();

}

class B implements interface1, interface2 {

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }

}

class A {

    void depend1(interface1 inter) {
        inter.operation1();
    }

    void depend2(interface2 inter) {
        inter.operation2();
    }

    void depend3(interface2 inter) {
        inter.operation3();
    }

}

class D implements interface1, interface3 {

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }

}

class C {

    void depend1(interface1 inter) {
        inter.operation1();
    }

    void depend4(interface3 inter) {
        inter.operation4();
    }

    void depend5(interface3 inter) {
        inter.operation5();
    }

}

