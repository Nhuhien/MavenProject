package servives;

import persistence.StoryRepository;

import java.util.List;

public class FeedService {
    StoryRepository storyRepository;

    public FeedService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<Story> fetchAll() {
        return storyRepository.getMessages();
    }


}
