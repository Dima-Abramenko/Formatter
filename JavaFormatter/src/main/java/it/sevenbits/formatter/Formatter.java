package main.java.it.sevenbits.formatter;


/**
 * formatting input java-code.
 */
public class Formatter implements IFormatter {
    private String content;
    public Formatter(final String _content) {
        this.content = _content;
    }

    /**
     * returns method.
     */
    final public String format() {
        String formatContent = content;
        String[] symbols = new String[] {"{", ";", "}"};
        for (int i = 0; i < symbols.length; i++) {
            formatContent = formatContent.replace(symbols[i], symbols[i] + "\n\t");
        }
        // Some code there
        return formatContent;
    }
}
