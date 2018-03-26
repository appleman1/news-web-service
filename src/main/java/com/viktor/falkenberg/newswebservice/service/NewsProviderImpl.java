package com.viktor.falkenberg.newswebservice.service;

import com.viktor.falkenberg.newswebservice.model.News;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * <p>
 * Создан 24.03.2018
 * <p>
 *
 * @author Виктор Фалькенберг (viktor.falkenberg@mediascope.net)
 */
@Service
public class NewsProviderImpl implements NewsProvider {
    @Override
    public Collection<News> getNews() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://lenta.ru";
        //ResponseEntity<News> responseEntity = restTemplate.getForEntity(url + "/rss", News.class);
        String string = restTemplate.getForObject(url + "/rss",String.class);
        return null;
    }
}
