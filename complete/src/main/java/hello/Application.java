package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.support.ResourcePropertySource;

import javax.swing.*;
import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(Application.class, args);
        try {
            app.getEnvironment().getPropertySources().addLast(new ResourcePropertySource("classpath:conf.xml"));
        } catch (IOException e) {
            System.out.println("There was an error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("There was an error" + e.getMessage());
        }
    }
}
