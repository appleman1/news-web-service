package com.viktor.falkenberg.newswebservice.service;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * Создан 24.03.2018
 * <p>
 *
 * @author Виктор Фалькенберг (viktor.falkenberg@mediascope.net)
 */
class NewsProviderImplTest {
    @Test
    public void test() {
        new NewsProviderImpl().getNews();
    }
}