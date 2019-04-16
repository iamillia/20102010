import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
		Comparator<Article> titleComparator = (a1, a2) -> a1.title.compareTo(a2.title);
		Comparator<Article> titlePageComparator = titleComparator.thenComparing((a1,a2) -> Integer.compare(a2.num, a1.num));
		Comparator<Article> articleRevComparator = titleComparator.reversed();
		Comparator<Article> nullFirstComparator = comparing(Article::getTitle, nullsFirst(naturalOrder()));
		Comparator<Article> nullLastComparator = comparing(Article::getTitle, nullsLast(naturalOrder()));
		
		
		TreeSet<Article> articlesTree = new TreeSet<>(titleComparator);
		Article[] articlesArray = new Article[7];
		Article[] articlesNArray = new Article[8];
		Article a1 = new Article("A", 100);
		Article a6 = new Article("A", 15);
		Article a2 = new Article("C", 30);
		Article a3 = new Article("D", 12);
		Article a4 = new Article("E", 6);
		Article a5 = new Article("F", 7);
		Article a7 = new Article("G", 7);
		Article n = new Article();
		articlesArray[0] = a1;
		articlesArray[1] = a2;
		articlesArray[2] = a3;
		articlesArray[3] = a4;
		articlesArray[4] = a5;
		articlesArray[5] = a6;
		articlesArray[6] = a7;
		
		
		articlesNArray[0] = a1;
		articlesNArray[1] = a2;
		articlesNArray[2] = a3;
		articlesNArray[3] = a4;
		articlesNArray[4] = a5;
		articlesNArray[5] = a6;
		articlesNArray[6] = a7;
		articlesNArray[7] = n;
		
		
		articlesTree.add(a1);
		articlesTree.add(a2);
		articlesTree.add(a3);
		articlesTree.add(a4);
		articlesTree.add(a5);
		articlesTree.add(a6);
		articlesTree.add(a7);
		
		Arrays.sort(articlesArray, titlePageComparator);
		//Arrays.sort(articlesArray, articleRevComparator);
		Arrays.sort(articlesNArray, nullFirstComparator);
		//Arrays.sort(articlesNArray, nullLastComparator);
		
		System.out.println();
		System.out.println("After TreeSet Comparator non-null sort");
		articlesTree.forEach((article)->System.out.println("'"+article.title+"', "+article.num+"pg."));
		
		
		System.out.println();
		System.out.println("After Arrays.sort() non-null sort");
		for(Article article : articlesArray) {
			System.out.println("'"+article.title+"', "+article.num+"pg.");
		}
		System.out.println();
		System.out.println("After null sort");
		for(Article article : articlesNArray) {
			System.out.println("'"+article.title+"', "+article.num+"pg.");
		}
	
		
	

	}
}


