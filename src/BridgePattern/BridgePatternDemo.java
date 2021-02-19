package BridgePattern;

import BridgePattern.advance.Circle;
import BridgePattern.advance.Shape;
import BridgePattern.function.impl.GreenCircle;
import BridgePattern.function.impl.RedCircle;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:51
 * @Description 桥接模式
 **/
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
