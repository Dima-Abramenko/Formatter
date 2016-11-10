package test.java.it.sevenbits;

import main.java.it.sevenbits.formatter.Formatter;
import main.java.it.sevenbits.formatter.IFormatter;
import main.java.it.sevenbits.reader.FileReader;
import main.java.it.sevenbits.reader.IReader;
import main.java.it.sevenbits.writer.FileWriter;
import main.java.it.sevenbits.writer.IWriter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Test fo MainClass.
 */
public class MainClassTest {
    private String inputURL;
    private String outputURL;
    @Before
    public void setUp() {
        inputURL = "/home/oem/Документы/7bits-Java/input.txt";
        outputURL = "/home/oem/Документы/7bits-Java/output.txt";
    }
    @Test
    public void TestInit() {
        IReader fileReader = new FileReader(inputURL);
        IWriter fileWriter = new FileWriter(outputURL);
        IFormatter formatter = new Formatter();
        formatter.format(fileReader, fileWriter);
    }
}
