package example;

// Import log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Example {
    

    private static final Logger logger = LogManager.getLogger(Example.class);

    public static String join(final String... args) {
        return String.join("; ", args);
    }

    public static void main(final String[] args) {
        logger.info("jar command line arguments: " + join(args));
        final String someProperty = System.getProperty("SOME_PROPERTY");
        logger.info("SOME_PROPERTY from System Property (on command-line): "+ someProperty);
    }
}
