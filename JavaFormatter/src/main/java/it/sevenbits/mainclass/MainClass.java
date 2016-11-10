package main.java.it.sevenbits.mainclass;

import main.java.it.sevenbits.formatter.Formatter;
import main.java.it.sevenbits.formatter.IFormatter;
import main.java.it.sevenbits.reader.FileReader;
import main.java.it.sevenbits.reader.IReader;
import main.java.it.sevenbits.writer.FileWriter;
import main.java.it.sevenbits.writer.IWriter;

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

        IReader fileReader = new FileReader(inputURL);
        IWriter fileWriter = new FileWriter(outputURL);
        IFormatter formatter = new Formatter();
        formatter.format(fileReader, fileWriter);



    }
}
