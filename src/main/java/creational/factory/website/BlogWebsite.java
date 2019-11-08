package creational.factory.website;

import creational.factory.pages.AboutPage;
import creational.factory.pages.CommentPage;
import creational.factory.pages.PostPage;

public class BlogWebsite extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CommentPage());
        pages.add(new PostPage());
        pages.add(new AboutPage());
    }
}
