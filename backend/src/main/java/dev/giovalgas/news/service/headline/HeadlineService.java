package dev.giovalgas.news.service.headline;

import dev.giovalgas.news.model.Headline;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HeadlineService {

  void deleteHeadline(String id); //TODO -> add authentication

  Headline createHeadline(Headline headline);

  Headline editHeadline(String id, Headline alteredHeadline);

  Headline getHeadlineById(String id);

  List<Headline> getHeadlinesByTags(List<String> tags);

  List<Headline> getAllHeadlines();

}
