package web;

import servives.FeedService;
import servives.PublicationService;
import servives.Story;

import java.util.ArrayList;
import java.util.List;

public class FeedController {

    List<Story> stories = new ArrayList<>();

    private FeedService feedService = new FeedService();
    private PublicationService publicationService = new PublicationService();

    public void post(String string) {
        Story st = new Story(string);
        publicationService.share(st);
    }


    public List<Story> feed() {
        return feedService.fetchAll();
    }
}
