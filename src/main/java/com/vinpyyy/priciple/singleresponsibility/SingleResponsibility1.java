package com.vinpyyy.priciple.singleresponsibility;

/**
 * 单一职责原则注意事项和细节
 * 1.降低类的复杂度，一个类只负责一项职责
 * 2.提高类的可读性，可维护性
 * 3.降低变更引起的风险
 * 4.通常情况下，我们应该遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则，
 *   只有类中方法数量足够少，可以在方法级别保持单一职责原则
 * @author VinPyyy
 * @create 2022/5/23 7:24
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}

// 交通工具类
// 方式1
// 1.在方式1的run方法中违反了单一职责原则
// 2.解决的方案很简单，根据交通工具运行方式的不同分解成不同的类即可
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }

}
