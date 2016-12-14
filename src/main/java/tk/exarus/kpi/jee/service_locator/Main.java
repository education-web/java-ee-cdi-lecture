package tk.exarus.kpi.jee.service_locator;

public final class Main {
    public static void main(String[] args) {
        PostService postService = ServiceLocator.INSTANCE.get(PostService.class);
        postService.publishPosts();
    }
}
