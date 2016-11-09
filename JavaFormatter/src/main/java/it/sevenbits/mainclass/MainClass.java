package main.java.it.sevenbits.mainclass;
import main.java.it.sevenbits.formatter.Formatter;
import main.java.it.sevenbits.reader.FileReader;
import main.java.it.sevenbits.writer.FileWriter;

import java.io.*;

/**
 * Created by Dmitry on 08.11.2016.
 */
public class MainClass {

    public static void main(String[] args) throws IOException {

        final String inputURL = "E:\\input.txt";
        final String outputURL = "E:\\output.txt";
        String content;
        String formattedContent;

        FileReader fileReader = new FileReader(inputURL);
        content = fileReader.read();
        System.out.println(content);

        Formatter formatter = new Formatter(content);
        formattedContent = formatter.format();
        System.out.println(formattedContent);

        FileWriter fileWriter = new FileWriter(outputURL,formattedContent);
        fileWriter.write();
    }
}
