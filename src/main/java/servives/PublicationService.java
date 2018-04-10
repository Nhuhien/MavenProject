package servives;

import persistence.StoryRepository;

public class PublicationService {
    StoryRepository storyRepository;

    public PublicationService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public void share(Story st) {
        storyRepository.add(st);
    }
}
