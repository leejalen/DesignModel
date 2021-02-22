package ChainOfResponsibilityPattern;

import ChainOfResponsibilityPattern.function.AbstractLogger;
import ChainOfResponsibilityPattern.function.impl.DebugLogger;
import ChainOfResponsibilityPattern.function.impl.ErrorLogger;
import ChainOfResponsibilityPattern.function.impl.InfoLogger;

/**
 * @Author Jalen
 * @Date 2021/2/22 23:17
 * @Description 责任链模式
 **/
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        System.out.println("-------------------------------------");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");

        System.out.println("-------------------------------------");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

        System.out.println("-------------------------------------");
    }

}
