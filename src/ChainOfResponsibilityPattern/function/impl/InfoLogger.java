package ChainOfResponsibilityPattern.function.impl;

import ChainOfResponsibilityPattern.function.AbstractLogger;

/**
 * @Author Jalen
 * @Date 2021/2/22 23:14
 * @Description
 **/
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info::Logger: " + message);
    }
}
