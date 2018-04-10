package servives;

import persistence.StoryRepository;

import java.util.List;

public class FeedService {
    StoryRepository storyRepository = new StoryRepository();

    public List<Story> fetchAll() {
        return storyRepository.getMessages();
    }


}
