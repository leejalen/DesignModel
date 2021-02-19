package FacadePattern.advance;

import FacadePattern.function.Shape;
import FacadePattern.function.impl.Circle;
import FacadePattern.function.impl.Rectangle;
import FacadePattern.function.impl.Square;

/**
 * @Author Jalen
 * @Date 2021/2/19 21:44
 * @Description TODO
 **/
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
