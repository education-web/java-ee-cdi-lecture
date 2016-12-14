package tk.exarus.kpi.jee.control_freak;

public final class PostService {
    private PostRepository postRepository = new ListPostRepository();

    public void publishPosts() {
        System.out.println(postRepository.getPosts());
    }
}
