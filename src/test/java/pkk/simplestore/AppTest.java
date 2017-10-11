package pkk.simplestore;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Test
    public void hello() throws Exception {
        System.out.println("hello");
        logger.info("hello logger");
    }
}
