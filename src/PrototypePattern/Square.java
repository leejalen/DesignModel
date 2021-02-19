package PrototypePattern;

/**
 * @Author Jalen
 * @Date 2020/6/1 17:24
 * @Description TODO
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
