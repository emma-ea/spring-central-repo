package com.emma_ea.content_service.sevice;

import com.emma_ea.content_service.model.Article;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;
import java.util.Optional;

public interface ContentService {

    @GetExchange("/articles")
    public List<Article> findAll();

    @GetExchange("/articles/{id}")
    public Optional<Article> findById(@PathVariable int id);

    @PostExchange("/articles")
    public void create(@RequestBody Article article);

    @PutExchange("/articles/{id}")
    public void update(@RequestBody Article article, @PathVariable int id);

    @DeleteExchange("/articles/{id}")
    public void delete(@PathVariable int id);

}
