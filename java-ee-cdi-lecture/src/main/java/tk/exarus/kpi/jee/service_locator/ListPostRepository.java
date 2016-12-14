package tk.exarus.kpi.jee.service_locator;

import java.util.List;

import static java.util.Arrays.asList;

public final class ListPostRepository implements PostRepository {
    private List<Post> posts = asList(
            new Post("hello", "world"),
            new Post("second", "sometext")
    );

    public List<Post> getPosts() {
        return posts;
    }
}
