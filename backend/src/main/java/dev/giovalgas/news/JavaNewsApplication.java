package dev.giovalgas.news;

import dev.giovalgas.news.model.Headline;
import dev.giovalgas.news.repository.HeadlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaNewsApplication.class, args);
	}

}
