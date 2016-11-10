package main.java.it.sevenbits.reader;

/**
 * reading java-code out if the String variable.
 */
public class StringReader implements IReader {

    private String inputString;

    public StringReader(final String _content) {
        this.inputString = _content;
    }
    /**
     *
     * returns method.
     */
    public String read() {

        return inputString;
    }
}
