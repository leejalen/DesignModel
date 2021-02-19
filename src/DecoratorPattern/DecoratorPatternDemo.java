package DecoratorPattern;

import DecoratorPattern.advance.RedShapeDecorator;
import DecoratorPattern.advance.ShapeDecorator;
import DecoratorPattern.function.Shape;
import DecoratorPattern.function.impl.Circle;
import DecoratorPattern.function.impl.Rectangle;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:31
 * @Description 装饰器模式
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
