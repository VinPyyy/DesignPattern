package com.vinpyyy.priciple.segregation;

/**
 * 接口隔离原则：客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
 * 1.类A通过Interface1依赖类B，类C通过Interface1依赖类D，如果Interface1对于类A和类C来说不是最小接口，那么类B类D必须去实现他们不需要的方法
 * 2.将接口Interface1拆分成独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系，也就是采用接口隔离原则
 * @author VinPyyy
 * @create 2022/5/23 8:27
 */
public class Segregation1 {



}

interface interface1 {

    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();

}

class B implements interface1 {

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

    @Override
    public void operation4() {
        System.out.println("B实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了operation5");
    }

}

class A {

    void depend1(interface1 inter) {
        inter.operation1();
    }

    void depend2(interface1 inter) {
        inter.operation2();
    }

    void depend3(interface1 inter) {
        inter.operation3();
    }

}

class D implements interface1 {

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了operation3");
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

    void depend4(interface1 inter) {
        inter.operation4();
    }

    void depend5(interface1 inter) {
        inter.operation5();
    }

}
