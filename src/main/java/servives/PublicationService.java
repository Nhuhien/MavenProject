package servives;

import persistence.StoryRepository;

public class PublicationService {
    StoryRepository storyRepository = new StoryRepository();

    public void share(Story st) {
        storyRepository.add(st);
    }
}
