package tech.zerofiltre.blog.domain.article;

import tech.zerofiltre.blog.domain.article.model.*;

import java.util.*;

public interface ArticleProvider {

    Optional<Article> articleOfId(long articleId);

    Article save(Article article);

    List<Article> articlesOf(int pageNumber, int numberPerPage);
}
