package behavioral.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("hi im julian");
        tabletClient.addMessage("from tablet");
    }
}
