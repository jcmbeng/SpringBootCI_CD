package services;

import dto.ArticleDto;

import java.util.List;

public interface ArticleService {

    ArticleDto save(ArticleDto dto);

    void delete(Long id);

    ArticleDto findById(Long id);

    List<ArticleDto> findAll();
}
