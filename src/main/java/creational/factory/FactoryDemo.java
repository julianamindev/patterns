package creational.factory;

import creational.factory.exceptions.InvalidWebsiteType;
import creational.factory.website.Website;
import creational.factory.website.WebsiteFactory;
import creational.factory.websitetypes.WebsiteType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryDemo {

    private static Logger log = LoggerFactory.getLogger(FactoryDemo.class);

    public static void main(String[] args) throws InvalidWebsiteType {

        Website blogSite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        log.info("Blog Website - {}", blogSite.getPages());

        Website shopSite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        log.info("Shop Website - {}", shopSite.getPages());
    }
}
