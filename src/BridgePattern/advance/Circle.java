package BridgePattern.advance;

import BridgePattern.function.DrawAPI;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:48
 * @Description TODO
 **/
public class Circle extends Shape{

    private int x,y,radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
