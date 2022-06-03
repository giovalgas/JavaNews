package dev.giovalgas.news.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Headline {

  @Id
  private String id;

  private String title;
  private String thumbnailUrl;
  private String markdownBody;
  private String authorName;
  private List<String> tags;

}
