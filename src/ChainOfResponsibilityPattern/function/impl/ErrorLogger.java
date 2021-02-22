package ChainOfResponsibilityPattern.function.impl;

import ChainOfResponsibilityPattern.function.AbstractLogger;

/**
 * @Author Jalen
 * @Date 2021/2/22 23:14
 * @Description
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
