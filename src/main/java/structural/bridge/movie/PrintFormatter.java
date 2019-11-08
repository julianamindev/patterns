package structural.bridge.movie;

import java.util.List;

public class PrintFormatter implements Formatter {

    private static final String NEWLINE = System.getProperty("line.separator");

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header)
                .append(NEWLINE);

        for (Detail detail : details) {
            builder.append(detail.getLabel())
                    .append(" : ")
                    .append(detail.getValue())
                    .append(NEWLINE);
        }

        return builder.toString();
    }
}
