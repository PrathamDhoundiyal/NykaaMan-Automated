package utils;

import org.apache.log4j.Logger;

public class LoggerHandler {

    // Initializing Logger instance
    public static Logger logger = Logger.getLogger(LoggerHandler.class);

    // Trace > Debug > Info > Warn > Error > Fatal
    // Logging methods for different levels

    public static void trace(String msg) {
        logger.trace(msg);
    }

    public static void debug(String msg) {
        logger.debug(msg);
    }

    public static void info(String msg) {
        logger.info(msg);
    }

    public static void warn(String msg) {
        logger.warn(msg);
    }

    public static void error(String msg) {
        logger.error(msg);
    }

    public static void fatal(String msg) {
        logger.fatal(msg);
    }
}