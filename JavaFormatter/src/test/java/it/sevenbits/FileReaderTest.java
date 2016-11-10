package test.java.it.sevenbits;

import main.java.it.sevenbits.reader.FileReader;
import main.java.it.sevenbits.reader.IReader;
import main.java.it.sevenbits.reader.StringReader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  Test fo FileReader.
 */
public class FileReaderTest {
    private IReader reader;

    @Before
    public void setUp() {
        reader = new StringReader("abc");

    }
    @Test
    public void testRead() {
        assertEquals("abc", reader.read());
    }


}
