package main.java.it.sevenbits.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Dmitry on 09.11.2016.
 */
public class FileReader implements IReader {

    private String URL;

    public FileReader(String _url) {
        this.URL = _url;
    }

    public String read() {

        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(URL);
        try {
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file.getAbsolutePath()));
            try {
                String s;
                while ((s=bufferedReader.readLine()) != null) {
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
            } finally {
                bufferedReader.close();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
}
