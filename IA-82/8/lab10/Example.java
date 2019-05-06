package laba10_2;

import java.util.function.*;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {


        Article ar1= new Article(5,"My title", "some text", "Nastya");
        Article ar2= new Article(6,"Titans of Literature", "some text", "Burton Rascoe");
        Article ar3= new Article(1,"Asian-American Writers", "so0me text", "Harold Bloom");
        ArticleEle ar4= new ArticleEle(9,"Modern Black", "someeeeee text", "Harold Bloom");
        ArticleEle ar5= new ArticleEle(5,"Winged Words", " text", "Laura Coltelli");
        ArticleNewspaper ar6= new ArticleNewspaper(8,"Words", null, "kl");


        List<Article> articles= new ArrayList<Article>();
        articles.add(ar1);
        articles.add(ar2);
        articles.add(ar3);
        articles.add(ar4);
        articles.add(ar5);
        articles.add(ar6);


     articles.forEach(a -> System.out.println(a.toString()));


}}
