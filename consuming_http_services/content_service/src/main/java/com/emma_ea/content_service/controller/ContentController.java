package com.emma_ea.content_service.controller;

import com.emma_ea.content_service.model.Article;
import com.emma_ea.content_service.sevice.ContentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/articles")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Article> findAllService() {
        return contentService.findAll();
    }

    @GetMapping("/articles/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<Article> findById(@PathVariable int id) {
        return contentService.findById(id);
    }

    @PostMapping("/articles")
    @ResponseStatus(HttpStatus.CREATED)
    public void createArticle(@RequestBody Article article) {
        contentService.create(article);
    }

    @PutMapping("/articles/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateArticle(@RequestBody Article article, @PathVariable int id) {
        contentService.update(article, id);
    }

    @DeleteMapping("/articles/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteArticle(@PathVariable int id) {
        contentService.delete(id);
    }

}
