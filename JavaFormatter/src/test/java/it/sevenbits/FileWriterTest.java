package test.java.it.sevenbits;

import main.java.it.sevenbits.writer.StringWriter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Test fo FileWriter.
 */
public class FileWriterTest {
    private StringWriter writer;
    @Before
    public void setUp() {
        writer = new StringWriter();
        writer.write("abc");
    }
    @Test
    public void testWrite() {
        assertEquals("abc",writer.getcontent());
    }

}
