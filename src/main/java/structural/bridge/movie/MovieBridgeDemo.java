package structural.bridge.movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovieBridgeDemo {
    private static Logger log = LoggerFactory.getLogger(MovieBridgeDemo.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Printer moviePrinter = new MoviePrinter(movie);
        Formatter printFormatter = new PrintFormatter();

        String printedMaterial = moviePrinter.print(printFormatter);

        //log.info("{}", printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlPrint = moviePrinter.print(htmlFormatter);

        //log.info("{}", htmlPrint);

        Book book = new Book();
        book.setGenre("Mystery");
        book.setTitle("Origin");
        book.setPages(400);

        Printer bookPrinter = new BookPrinter(book);
        Formatter bookPrintFormatter = new PrintFormatter();

        String bookPrinteedMaterial = bookPrinter.print(bookPrintFormatter);

        log.info("{}", bookPrinteedMaterial);
    }
}
