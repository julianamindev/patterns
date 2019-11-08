package creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypeDemo {

    private static Logger log = LoggerFactory.getLogger(PrototypeDemo.class);

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Gone with the Wind");

        log.info("{}\n{}\n{}\n{}", movie, movie.getRuntime(), movie.getTitle(), movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Citizen Kane");

        log.info("{}\n{}\n{}\n{}", anotherMovie, anotherMovie.getRuntime(), anotherMovie.getTitle(), anotherMovie.getUrl());

    }
}
