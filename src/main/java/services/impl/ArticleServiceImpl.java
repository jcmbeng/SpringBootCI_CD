package services.impl;

import dto.ArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ArticleRepository;
import services.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {


    private ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository)
    {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleDto save(ArticleDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ArticleDto findById(Long id) {
        return null;
    }

    @Override
    public List<ArticleDto> findAll() {
        return null;
    }
}
