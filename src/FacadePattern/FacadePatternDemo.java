package FacadePattern;

import FacadePattern.advance.ShapeMaker;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:48
 * @Description 外观模式
 **/
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
