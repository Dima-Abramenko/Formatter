package main.java.it.sevenbits.writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *  writing formatted java-code in file.
 */
public class FileWriter implements IWriter {
    private String URL;
    private String content;
    public FileWriter(final String _url, final String _content) {
        this.URL = _url;
        this.content = _content;
    }

    /**
     * entry method.
     */
    final public void write() {
        File file = new File(URL);
        try {
            if (!file.exists()) {
            file.createNewFile();
            }

            PrintWriter printWriter = new PrintWriter(file.getAbsolutePath());
            try {
                printWriter.print(content);
            } finally {
                printWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
