package FacadePattern.function.impl;

import FacadePattern.function.Shape;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:42
 * @Description TODO
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
