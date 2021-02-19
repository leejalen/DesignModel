package ProxyPattern;

import ProxyPattern.function.Image;
import ProxyPattern.function.impl.ProxyImage;

/**
 * @Author Jalen
 * @Date 2021/2/19 23:12
 * @Description
 **/
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
