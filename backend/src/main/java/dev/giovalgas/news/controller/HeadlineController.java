package dev.giovalgas.news.controller;

import dev.giovalgas.news.model.Headline;
import dev.giovalgas.news.service.headline.HeadlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/headlines")
@RequiredArgsConstructor
public class HeadlineController {

  private final HeadlineService headlineService;

  @GetMapping
  public ResponseEntity<List<Headline>> getHeadlines() {
    return ResponseEntity.ok(headlineService.getAllHeadlines());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Headline> getHeadlineById(@PathVariable String id) {
    return ResponseEntity.ok(headlineService.getHeadlineById(id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Headline> editHeadline(@PathVariable String id, @RequestPart Headline alteredHeadline) {
    return ResponseEntity.ok(headlineService.editHeadline(id, alteredHeadline));
  }

  @PostMapping
  public ResponseEntity<Headline> createHeadline(@RequestPart Headline headline) {
    return new ResponseEntity<>(headlineService.createHeadline(headline), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Headline> deleteHeadline(@PathVariable String id) {
    headlineService.deleteHeadline(id);
    return ResponseEntity.noContent().build();
  }

}
