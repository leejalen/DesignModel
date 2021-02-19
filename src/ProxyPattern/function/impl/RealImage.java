package ProxyPattern.function.impl;

import ProxyPattern.function.Image;

/**
 * @Author Jalen
 * @Date 2021/2/19 23:10
 * @Description
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
