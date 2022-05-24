package com.vinpyyy.priciple.ocp.improve;

/**
 * @author VinPyyy
 * @create 2022/5/24 22:11
 */
public class Ocp {

    public static void main(String[] args) {
        new GraphicEditor().drawShape(new Rectangle());
        new GraphicEditor().drawShape(new OtherShape());
    }

}

class GraphicEditor {

    public void drawShape(Shape shape) {
        shape.draw();
    }


}

abstract class Shape {

    int m_type;

    public abstract void draw();

}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

}

// 新增其他图形
class OtherShape extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }

}
