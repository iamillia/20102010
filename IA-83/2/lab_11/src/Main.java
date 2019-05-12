import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//constructor reference
		CreateArticle article = Article::new;
		
		Article art1 = article.article("Ukraine", 100);
		Article art2 = article.article("Exam", 10);
		Article art3 = article.article("Nature", 50);
		Article art4 = article.article("Life", 100000);
		
		Article[] articles = {art1, art2, art3, art4};
		List<Article> artList = Arrays.asList(articles);
		
		//reference to static method of class
		Arrays.sort(articles, Article::compareByTitle);

		//reference to non-static method of class
		artList.forEach(Article::print);
		
		System.out.println();
		
		//reference to non-static method of object
		artList.forEach(System.out::println);
		
	}
}


interface CreateArticle{
	Article article(String title, int number);
}
