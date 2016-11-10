package main.java.it.sevenbits.formatter;


import main.java.it.sevenbits.reader.FileReader;
import main.java.it.sevenbits.reader.IReader;
import main.java.it.sevenbits.writer.FileWriter;
import main.java.it.sevenbits.writer.IWriter;

/**
 * formatting input java-code.
 */
public class Formatter implements IFormatter {
    private String content;

    /**
     * returns method.
     */
    final public void format(IReader reader, IWriter writer) {
        content = reader.read();
        String[] symbols = new String[] {"{", ";", "}"};
        for (int i = 0; i < symbols.length; i++) {
            content = content.replace(symbols[i], symbols[i] + "\n\t");
        }
        // Some code there
        writer.write(content);
    }
    final public String getContent() {
        return content;
    }
}
