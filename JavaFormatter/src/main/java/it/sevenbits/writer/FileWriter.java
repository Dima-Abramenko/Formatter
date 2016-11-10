package main.java.it.sevenbits.writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *  writing formatted java-code in file.
 */
public class FileWriter implements IWriter {
    private String URL;
    public FileWriter(final String _url) {
        this.URL = _url;
    }

    /**
     * entry method.
     */
    final public void write(final String _content) {
        File file = new File(URL);
        try {
            if (!file.exists()) {
            file.createNewFile();
            }

            PrintWriter printWriter = new PrintWriter(file.getAbsolutePath());
            try {
                printWriter.print(_content);
            } finally {
                printWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
