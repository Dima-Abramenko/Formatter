package main.java.it.sevenbits.formatter;

import main.java.it.sevenbits.reader.FileReader;
import main.java.it.sevenbits.reader.IReader;
import main.java.it.sevenbits.writer.IWriter;

/**
 * Created by Dmitry on 09.11.2016.
 */
public class Formatter implements IFormatter{
    private int countDepth = 1;
    private String URL;
    private String content;
    public Formatter(String _content) {
        this.content = _content;
    }

    public String format() {
        StringBuilder sb = new StringBuilder(content);
        for(int i=0; i<sb.length(); i++) {
            if (sb.charAt(i)=='{'){
                sb.setCharAt(i+1,'\n');
                for (int j=0; j<countDepth;j++){
                    sb.insert(i+2,'\t');
                }
                countDepth++;
            }
            else if (sb.charAt(i)==';') {
                sb.setCharAt(i+1,'\n');
                sb.insert(i+2,'\t');
            }
            else if (sb.charAt(i)=='}') {
                sb.setCharAt(i+1,'\n');
                sb.insert(i+2,'\t');
            }
        }
        return sb.toString();
    }
}
