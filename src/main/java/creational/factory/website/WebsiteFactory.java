package creational.factory.website;

import creational.factory.exceptions.InvalidWebsiteType;
import creational.factory.websitetypes.WebsiteType;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType type) throws InvalidWebsiteType {
        switch (type) {
            case BLOG: {
                return new BlogWebsite();
            }

            case SHOP: {
                return new ShopWebsite();
            }

            default: {
                throw new InvalidWebsiteType("Invalid website type");
            }

        }
    }
}
