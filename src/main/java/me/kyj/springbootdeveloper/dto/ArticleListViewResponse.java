package me.kyj.springbootdeveloper.dto;

import lombok.Getter;
import me.kyj.springbootdeveloper.domain.Article;

@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;
    private final String imageUrl;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.imageUrl =article.getImageUrl();
    }

}
