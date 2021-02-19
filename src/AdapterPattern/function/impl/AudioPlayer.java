package AdapterPattern.function.impl;

import AdapterPattern.function.MediaPlayer;

/**
 * @Author Jalen
 * @Date 2021/2/7 21:12
 * @Description
 **/
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")){
            System.out.println("playing mp3: " + fileName);
        }else if (audioType.equals("mp4") || audioType.equals("mp5")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("this format not supported");
        }
    }
}
