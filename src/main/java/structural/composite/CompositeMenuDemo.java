package structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompositeMenuDemo {
    private static Logger log = LoggerFactory.getLogger(CompositeMenuDemo.class);

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        log.info("{}", mainMenu);
    }
}
