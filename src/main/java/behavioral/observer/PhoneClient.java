package behavioral.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    protected void update() {
        log.info("Phone Stream: {}", subject.getState());
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }
}
