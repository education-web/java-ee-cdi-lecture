package tk.exarus.kpi.jee.control_freak;

public final class Main {
    public static void main(String[] args) {
        PostService postService = new PostService();
        postService.publishPosts();
    }
}
