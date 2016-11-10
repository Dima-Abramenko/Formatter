package main.java.it.sevenbits.formatter;

import main.java.it.sevenbits.reader.IReader;
import main.java.it.sevenbits.writer.IWriter;

/**
 * interface for formatting.
 */
public interface IFormatter {
    /**
     * returns method.
     */
    void format(IReader reader, IWriter writer);
}
