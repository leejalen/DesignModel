package ChainOfResponsibilityPattern.function.impl;

import ChainOfResponsibilityPattern.function.AbstractLogger;

/**
 * @Author Jalen
 * @Date 2021/2/22 23:14
 * @Description
 **/
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug::Logger: " + message);
    }
}
