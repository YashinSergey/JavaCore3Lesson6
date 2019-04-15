package lesson.logging;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.logging.*;

/**
 * OFF
 * SEVERE
 * WAR
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST
 * ALL
 */

public class MyLog {
    private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass().getName()); // lesson.logging.MyLog.class.getName()
    private static Date date;

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);


        try {
            Handler fileHandler = new FileHandler("mylog.txt", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord record) {
                    date = new Date();
                    return record.getLevel() + ":\t" + record.getMessage() + "\t" + date + "\n";
                }
            });
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.getHandlers()[0].setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                date = new Date();
                return record.getLevel() + "\t" + record.getMessage() + "\t" + date + "\n";
            }
        });
        logger.getHandlers()[0].setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().startsWith("3") || record.getMessage().startsWith("2");
            }
        });



        logger.log(Level.SEVERE, "1");
        logger.log(Level.INFO, "2");
        logger.log(Level.CONFIG, "3");
        logger.log(Level.FINE, "4");


        logger.getHandlers()[0].setLevel(Level.ALL);

    }
}
