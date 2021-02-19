package ProxyPattern.function.impl;

import ProxyPattern.function.Image;

/**
 * @Author Jalen
 * @Date 2021/2/19 23:11
 * @Description
 **/
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
