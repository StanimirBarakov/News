package com.soft.mena.news.model.repositories;

import com.soft.mena.news.model.entities.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(path = "search")
public interface NewsRepository extends JpaRepository<News,Long> {

    Page<News> findAllByTitle(@Param("title") String title, Pageable pageable);
    Page<News> findAllByDate(@Param("date") LocalDate date,Pageable pageable);

}
