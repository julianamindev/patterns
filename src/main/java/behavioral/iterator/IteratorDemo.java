package behavioral.iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

@Slf4j
public class IteratorDemo {

    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

        while (bikeIterator.hasNext()) {
            log.info("{}", bikeIterator.next());
            // bikeIterator.remove(); // unsupported
        }
    }


}
