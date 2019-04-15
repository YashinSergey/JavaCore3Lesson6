package lesson.logging;

import org.apache.log4j.Logger;

public class Log4jExample {


    public static void main(String[] args) {

        Logger loggerFile = Logger.getLogger("file");
        Logger loggerAdmin = Logger.getLogger("admin");
        loggerFile.info("Hello, java");
        loggerAdmin.info("Hello, C#");
    }
}
