package com.viktor.falkenberg.newswebservice.model;

import javax.persistence.*;
import java.net.URL;
import java.util.Objects;
import java.util.UUID;

/**
 * <p>
 * Создан 24.03.2018
 * <p>
 *
 * @author Виктор Фалькенберг (viktor.falkenberg@mediascope.net)
 */
@Entity
@Table(name = "news")
public class News {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "title")
    private String header;

    @Column(name = "link")
    private URL link;

    public UUID getId() {
        return id;
    }

    public News setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public News setHeader(String header) {
        this.header = header;
        return this;
    }

    public URL getLink() {
        return link;
    }

    public News setLink(URL link) {
        this.link = link;
        return this;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", link=" + link +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(getId(), news.getId()) &&
                Objects.equals(getHeader(), news.getHeader()) &&
                Objects.equals(getLink(), news.getLink());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getHeader(), getLink());
    }
}
