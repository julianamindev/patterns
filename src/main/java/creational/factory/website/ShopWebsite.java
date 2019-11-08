package creational.factory.website;

import creational.factory.pages.ContactPage;
import creational.factory.pages.ItemPage;
import creational.factory.pages.SearchPage;

public class ShopWebsite extends Website {
    @Override
    public void createWebsite() {
        pages.add(new SearchPage());
        pages.add(new ItemPage());
        pages.add(new ContactPage());
    }
}
