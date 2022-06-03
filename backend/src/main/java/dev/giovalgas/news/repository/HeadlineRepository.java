package dev.giovalgas.news.repository;

import dev.giovalgas.news.model.Headline;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HeadlineRepository extends MongoRepository<Headline, String> {

  List<Headline> findAllByTags(List<String> tags);

}
