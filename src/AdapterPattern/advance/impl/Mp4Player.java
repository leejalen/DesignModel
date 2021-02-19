package AdapterPattern.advance.impl;

import AdapterPattern.advance.AdvanceMediaPlayer;

/**
 * @Author Jalen
 * @Date 2021/2/7 20:58
 * @Description
 **/
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4: " + fileName);
    }

    @Override
    public void playMp5(String fileName) {

    }
}
