package FacadePattern.function.impl;

import FacadePattern.function.Shape;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:43
 * @Description TODO
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
