package com.viktor.falkenberg.newswebservice.service;

import com.viktor.falkenberg.newswebservice.model.News;

import java.util.Collection;

/**
 * <p>
 * Создан 24.03.2018
 * <p>
 *
 * @author Виктор Фалькенберг (viktor.falkenberg@mediascope.net)
 */
public interface NewsProvider {
    Collection<News> getNews();
}
