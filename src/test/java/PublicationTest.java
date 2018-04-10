import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import persistence.StoryRepository;
import servives.FeedService;
import servives.PublicationService;
import servives.Story;
import web.FeedController;

import java.util.Arrays;
import java.util.List;

public class PublicationTest {
    FeedController feedController;

    @Before
    public void setUp() {
        StoryRepository storyRepository = new StoryRepository();
        PublicationService publicationService = new PublicationService(storyRepository);
        FeedService feedService = new FeedService(storyRepository);
        feedController = new FeedController(feedService, publicationService);
    }

    @Test
    public void should_post_story() {
        //GIVEN
        String story = "hi INFO4";


        //WHEN
        feedController.post(story);

        //THEN
        List<Story> postedStories = feedController.feed();
        Assert.assertEquals(Arrays.asList(new Story("hi INFO4")), postedStories);

    }
}
