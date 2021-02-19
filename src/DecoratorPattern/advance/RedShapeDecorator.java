package DecoratorPattern.advance;

import DecoratorPattern.function.Shape;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:26
 * @Description TODO
 **/
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
