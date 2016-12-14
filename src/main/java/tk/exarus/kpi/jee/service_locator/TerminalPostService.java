package tk.exarus.kpi.jee.service_locator;

public final class TerminalPostService implements PostService {
    private PostRepository postRepository = ServiceLocator.INSTANCE.get(PostRepository.class);

    public void publishPosts() {
        System.out.println(postRepository.getPosts());
    }
}
