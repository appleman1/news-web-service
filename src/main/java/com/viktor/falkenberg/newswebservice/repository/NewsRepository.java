package com.viktor.falkenberg.newswebservice.repository;

import com.viktor.falkenberg.newswebservice.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * <p>
 * Создан 24.03.2018
 * <p>
 *
 * @author Виктор Фалькенберг (viktor.falkenberg@mediascope.net)
 */
public interface NewsRepository extends JpaRepository<News, UUID> {
}
