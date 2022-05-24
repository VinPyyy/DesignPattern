package com.vinpyyy.priciple.ocp;

/**
 * 开闭原则
 * 1.一个软件实现如类，模块和函数应该对扩展开放，对修改关闭，用抽象构建框架，用实现扩展细节
 * 2.当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化
 * @author VinPyyy
 * @create 2022/5/24 21:58
 */
public class Ocp {

    public static void main(String[] args) {
        new GraphicEditor().drawShape(new Rectangle());
    }

}

class GraphicEditor {

    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawRectangle();
        } else if (shape.m_type == 2) {
            drawCircle();
        } else if (shape.m_type == 3) {
            drawTriangle();
        }
    }

    public void drawRectangle() {
        System.out.println("绘制矩形");
    }

    public void drawCircle() {
        System.out.println("绘制圆形");
    }

    public void drawTriangle() {
        System.out.println("绘制三角形");
    }

}

class Shape {

    int m_type;

}

class Rectangle extends Shape {

    Rectangle() {
        super.m_type = 1;
    }

}

class Circle extends Shape {

    Circle() {
        super.m_type = 2;
    }

}

class Triangle extends Shape {

    Triangle() {
        super.m_type = 3;
    }

}
