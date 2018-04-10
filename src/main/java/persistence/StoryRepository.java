package persistence;

import servives.Story;

import java.util.ArrayList;
import java.util.List;

public class StoryRepository {

    static List<Story> messages = new ArrayList<>();

    public List<Story> getMessages() {
        return messages;
    }

    public void add(Story st) {
        messages.add(st);
    }
}
