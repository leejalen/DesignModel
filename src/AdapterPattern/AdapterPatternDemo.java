package AdapterPattern;

import AdapterPattern.function.MediaPlayer;
import AdapterPattern.function.impl.AudioPlayer;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:16
 * @Description 适配器模式
 **/
public class AdapterPatternDemo {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();

        mediaPlayer.play("mp3", "雪下的那么深");

        mediaPlayer.play("mp4", "唐人街探案");

        mediaPlayer.play("mp5", "飞跃江西");
    }
}
