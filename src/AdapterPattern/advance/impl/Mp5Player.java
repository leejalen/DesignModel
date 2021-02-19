package AdapterPattern.advance.impl;

import AdapterPattern.advance.AdvanceMediaPlayer;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:00
 * @Description
 **/
public class Mp5Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playMp5(String fileName) {
        System.out.println("playing mp5: " + fileName);
    }
}
