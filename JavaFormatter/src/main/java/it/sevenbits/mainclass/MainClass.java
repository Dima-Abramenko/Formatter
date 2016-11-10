package main.java.it.sevenbits.mainclass;

import main.java.it.sevenbits.formatter.Formatter;
import main.java.it.sevenbits.reader.FileReader;
import main.java.it.sevenbits.writer.FileWriter;

import java.io.*;

/**
 * main class of the project.
 */
public class MainClass {
    /**
     * Entry method.
     * @param args command line args, ignored.
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {

        final String inputURL = "/home/oem/Документы/7bits-Java/input.txt";
        final String outputURL = "/home/oem/Документы/7bits-Java/output.txt";
        String content;
        String formattedContent;

        FileReader fileReader = new FileReader(inputURL);
        content = fileReader.read();
        System.out.println(content);

        Formatter formatter = new Formatter(content);
        formattedContent = formatter.format();
        System.out.println(formattedContent);


        FileWriter fileWriter = new FileWriter(outputURL, formattedContent);
        fileWriter.write();
    }
}
