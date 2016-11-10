package main.java.it.sevenbits.writer;



/**
 * writing Java-code.
 */
public class StringWriter implements IWriter {
        private String content;
    /**
     * entry method.
     */
     public void write(final String _content) {
            content = _content;
    }
    public String getcontent() {
        return content;
    }
}
