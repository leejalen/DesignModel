package PrototypePattern;

/**
 * @Author Jalen
 * @Date 2020/6/1 17:24
 * @Description TODO
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
