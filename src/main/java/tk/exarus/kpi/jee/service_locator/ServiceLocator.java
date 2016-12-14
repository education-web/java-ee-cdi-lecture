package tk.exarus.kpi.jee.service_locator;

import com.google.common.collect.ImmutableMap;
import lombok.SneakyThrows;

import java.util.Map;

public enum ServiceLocator {
    INSTANCE;

    private Map<Class<?>, Class<?>> context = ImmutableMap.of(
            PostService.class, TerminalPostService.class,
            PostRepository.class, ListPostRepository.class
    );

    @SneakyThrows
    public <T> T get(Class<T> clazz) {
        return (T) context.get(clazz).newInstance();
    }
}
