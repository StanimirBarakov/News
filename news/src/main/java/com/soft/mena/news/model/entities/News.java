package com.soft.mena.news.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "news")
@Getter
@Setter
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TIMESTAMP",insertable = false, updatable = false)
    private LocalDate date;
    @Column
    private String title;
    @Column
    private String description;
    @Column(length = 2000)
    private String text;

    public News() {
        setDate(LocalDate.now());
    }

    public News(String title, String description, String text) {
        setDate(LocalDate.now());
        this.title = title;
        this.description = description;
        this.text = text;
    }
}
