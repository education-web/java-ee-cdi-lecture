package tk.exarus.kpi.jee.bastard_injection;

public final class Main {
    public static void main(String[] args) {
        PostService postService = new PostService();
        postService.publishPosts();
    }
}
