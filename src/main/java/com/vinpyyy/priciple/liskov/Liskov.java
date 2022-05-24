package com.vinpyyy.priciple.liskov;

/**
 * 里氏替换原则
 * 1.如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1
 * 都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型，换句话说，所有引用
 * 基类的地方必须能透明的使用其子类的对象
 * 2.在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
 * 3.里氏替换原则告诉我们，继承实际上让两个类的耦合性增强了，在适当的情况下，可以通过聚合、组合、
 * 依赖来解决问题
 * @author VinPyyy
 * @create 2022/5/24 21:28
 */
public class Liskov {

    public static void main(String[] args) {
        System.out.println(new A().subtract(2, 1));
        System.out.println(new B().subtract(2, 1));
    }

}

class A {

    public int subtract(int a, int b) {
        return a - b;
    }

}

class B extends A {

    @Override
    public int subtract(int a, int b) {
        return a + b;
    }

}
