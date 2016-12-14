package tk.exarus.kpi.jee.bastard_injection;

public final class PostService {
    private PostRepository postRepository;

    public PostService() {
        this(new ListPostRepository());
    }

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void publishPosts() {
        System.out.println(postRepository.getPosts());
    }
}
