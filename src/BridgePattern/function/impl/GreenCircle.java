package BridgePattern.function.impl;

import BridgePattern.function.DrawAPI;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:36
 * @Description TODO
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing green circle: radius" + radius + " x" + x + " y" + y);
    }
}
