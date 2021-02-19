package BridgePattern.advance;

import BridgePattern.function.DrawAPI;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:39
 * @Description
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
