package com.vinpyyy.priciple.inversion.improve;

/**
 * @author VinPyyy
 * @create 2022/5/24 8:17
 */
public class DependencyInversion {

    public static void main(String[] args) {
        new Person().receive(new Email());
        new Person().receive(new WeiXin());
    }

}

interface Receiver {

    String getInfo();

}

class Email implements Receiver {

    @Override
    public String getInfo() {
        return "电子邮件：hello,world";
    }

}
class WeiXin implements Receiver {

    @Override
    public String getInfo() {
        return "微信：hello,ok";
    }

}

class Person {

    public void receive(Receiver receiver) {
        System.out.println(receiver.getInfo());
    }

}