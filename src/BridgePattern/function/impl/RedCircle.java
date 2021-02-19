package BridgePattern.function.impl;

import BridgePattern.function.DrawAPI;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:34
 * @Description TODO
 **/
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing red circle: radius" + radius + " x" + x + " y" + y);
    }
}
