package hello;

import org.springframework.beans.factory.annotation.Value;

public class Greeting {

    private final long id;
    private final String content;

    @Value("spring.application.name")
    String appName;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return appName;
    }
}
