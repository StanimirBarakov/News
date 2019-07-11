package com.soft.mena.news.controller;

import com.soft.mena.news.model.entities.News;
import com.soft.mena.news.model.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NewsController {

    @Autowired
    NewsRepository newsRepository;

    @PostMapping(value = "/news")
    public News createNews(@RequestBody News news){
        News savedNews = newsRepository.save(news);
        Optional<News> byId = newsRepository.findById(savedNews.getId());
        return savedNews;
    }

}
