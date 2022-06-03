package dev.giovalgas.news.service.headline;

import dev.giovalgas.news.exception.NotFoundException;
import dev.giovalgas.news.model.Headline;
import dev.giovalgas.news.repository.HeadlineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeadlineProvider implements HeadlineService {

  private final HeadlineRepository headlineRepository;

  @Override
  public void deleteHeadline(Headline headline) {
    headlineRepository.deleteById(headline.getId());
  }

  @Override
  public void createHeadline(Headline headline) {
    headlineRepository.insert(headline);
  }

  @Override
  public void editHeadline(String id, Headline alteredHeadline) {
    headlineRepository.findById(id)
            .map(headline -> {
              headline.setAuthorName(alteredHeadline.getAuthorName());
              headline.setTitle(alteredHeadline.getTitle());
              headline.setThumbnailUrl(alteredHeadline.getThumbnailUrl());
              headline.setMarkdownBody(alteredHeadline.getMarkdownBody());
              headline.setTags(alteredHeadline.getTags());

              return headline;
            })
            .orElseThrow(() -> new NotFoundException("Did not find a headline by id: " + id));
  }

  @Override
  public Headline getHeadlineById(String id) {
    return headlineRepository.findById(id)
            .orElseThrow(() -> new NotFoundException("Did not find a headline by id: " + id));
  }

  @Override
  public List<Headline> getHeadlinesByTags(List<String> tags) {
    return headlineRepository.findAllByTags(tags);
  }

  @Override
  public List<Headline> getAllHeadlines() {
    return headlineRepository.findAll();
  }

}
