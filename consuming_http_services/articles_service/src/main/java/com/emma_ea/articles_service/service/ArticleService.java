package com.emma_ea.articles_service.service;

import com.emma_ea.articles_service.model.Article;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    private final List<Article> articles = new ArrayList<>();

    public List<Article> findAll() {
        return articles;
    }

    public Optional<Article> findById(int id) {
        return articles.stream().filter(i -> i.id() == id).findFirst();
    }

    public int create(Article article) {
        boolean res = articles.add(article);
        return res ? 1 : -1;
    }

    public void update(Article article, int id) {
        Optional<Article> existingArticle = articles.stream().filter(i -> i.id() == id).findFirst();
        existingArticle.ifPresent(i -> articles.set(articles.indexOf(i), article));
    }

    public int delete(int id) {
        boolean res = articles.removeIf(i -> i.id() == id);
        return res ? 1 : -1;
    }

    @PostConstruct
    public void init() {
        Article article = new Article(1, "Hello, world", "This is a new article");
        articles.add(article);
    }

}
