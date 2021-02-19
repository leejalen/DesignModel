package DecoratorPattern.function.impl;

import DecoratorPattern.function.Shape;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:22
 * @Description TODO
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
