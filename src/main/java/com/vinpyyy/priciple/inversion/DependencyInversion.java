package com.vinpyyy.priciple.inversion;

/**
 * 依赖倒转原则
 * 1.高层模块不应该依赖底层模块，二者都应该依赖其抽象
 * 2.抽象不应该依赖细节，细节应该依赖抽象
 * 3.依赖倒转(倒置)的中心思想是面向接口编程
 * @author VinPyyy
 * @create 2022/5/24 8:00
 */
public class DependencyInversion {

    public static void main(String[] args) {
        new Person().receive(new Email());
    }

}

class Email {

    public String getInfo() {
        return "电子邮件：hello,world";
    }

}

// 完成Person实现接收消息的功能
// 方案1分析
// 1.简单，比较容易想到
// 2.如果我们获取的对象是微信，短信等等，则新增类，同时Person类也需要增加对应的接收方法
// 3.解决思路，引入一个抽象接口Receiver，表示接收者，这样Person类与Receiver接口发生依赖
//   因为Email，WeiXin属于接收的范围，他们各自实现Receiver接口就ok，这样就符合依赖倒转原则
class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

}
