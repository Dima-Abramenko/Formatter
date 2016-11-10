package test.java.it.sevenbits;

import main.java.it.sevenbits.formatter.Formatter;
import main.java.it.sevenbits.formatter.IFormatter;
import main.java.it.sevenbits.reader.IReader;
import main.java.it.sevenbits.reader.StringReader;
import main.java.it.sevenbits.writer.IWriter;
import main.java.it.sevenbits.writer.StringWriter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test fo Formatter.
 */
public class FormatterTest {
    private IFormatter formatter;
    @Before
    public void setUp() {
        formatter = new Formatter();
    }
    @Test
    public void testFormat() {
        IReader reader = new StringReader("abc");
        IWriter writer = new StringWriter();
        formatter.format(reader, writer);
        assertEquals("abc", reader.read());
    }
}
