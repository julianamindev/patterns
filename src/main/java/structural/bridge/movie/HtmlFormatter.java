package structural.bridge.movie;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.List;

public class HtmlFormatter implements Formatter {
    private static final String NEWLINE = System.getProperty("line.separator");
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("<html>")
                .append(NEWLINE)
                .append(header)
                .append(NEWLINE);

        for (Detail detail : details) {
            builder.append(detail.getLabel())
                    .append(" : ")
                    .append(detail.getValue())
                    .append(NEWLINE);
        }

        builder.append("</html>");

        return builder.toString();
    }
}
