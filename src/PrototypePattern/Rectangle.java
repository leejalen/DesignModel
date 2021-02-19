package PrototypePattern;

/**
 * @Author Jalen
 * @Date 2020/6/1 17:21
 * @Description TODO
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
