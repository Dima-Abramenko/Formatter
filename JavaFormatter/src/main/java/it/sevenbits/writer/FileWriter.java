package main.java.it.sevenbits.writer;

import main.java.it.sevenbits.reader.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by Dmitry on 09.11.2016.
 */
public class FileWriter implements IWriter {
    private String URL;
    private String content;
    public FileWriter(String _url, String _content) {
        this.URL = _url;
        this.content = _content;
    }

    public void write() {
        File file = new File(URL);
        try {
            if(!file.exists()){
            file.createNewFile();
            }

            PrintWriter printWriter = new PrintWriter(file.getAbsolutePath());
            try {
                printWriter.print(content);
            } finally {
                printWriter.close();
            }
        }catch (IOException e) {
            throw new RuntimeException( e);
        }
    }

}
