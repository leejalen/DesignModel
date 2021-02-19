package DecoratorPattern.advance;

import DecoratorPattern.function.Shape;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:25
 * @Description TODO
 **/
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
