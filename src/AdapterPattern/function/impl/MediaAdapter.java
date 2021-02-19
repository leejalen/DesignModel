package AdapterPattern.function.impl;

import AdapterPattern.advance.AdvanceMediaPlayer;
import AdapterPattern.advance.impl.Mp4Player;
import AdapterPattern.advance.impl.Mp5Player;
import AdapterPattern.function.MediaPlayer;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:02
 * @Description 媒体播放器适配器
 **/
public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("mp4")){
            advanceMediaPlayer = new Mp4Player();
        }else if (audioType.equals("mp5")){
            advanceMediaPlayer = new Mp5Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }else if (audioType.equals("mp5")){
            advanceMediaPlayer.playMp5(fileName);
        }
    }
}
