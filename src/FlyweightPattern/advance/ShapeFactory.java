package FlyweightPattern.advance;

import FlyweightPattern.function.Shape;
import FlyweightPattern.function.impl.Circle;

import java.util.HashMap;

/**
 * @Author Jalen
 * @Date 2021/2/19 22:45
 * @Description
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
