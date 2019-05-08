import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        // 26 variant
        double y6 = QuadCalculator.calculate((a, b, c, d) -> 3 * (log10(abs(b / a)) + sqrt(sin(c) + exp(d))),
                -1.23, -0.34, 0.77, 2.312);
        double y15 = QuadCalculator.calculate((a, b, c, d) -> 2 * sqrt(tan(a) / abs(acos(b))) - 3 * cbrt(exp(c - a) * sinh(d)),
                1.25, 3.09, 4.25, 0.56);
        double y24 = QuadCalculator.calculate((a, b, c, d) -> (cos(b) + sin(sqrt(a))) / (2 * log10(c) + exp(d)),
                0.345, -2.25, 2.65, 3.99);
        System.out.printf("%.3f\n", y6);
        System.out.printf("%.3f\n", y15);
        System.out.printf("%.3f\n", y24);


        List<Article> articles = new ArrayList<>();

        addTestArticles(articles);

        articles.forEach(System.out::println);

    }

    private static void addTestArticles(List<Article> articles) {
        Article a = new Article("test", "test_content");
        Article a1 = new Article("test", "test_content");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Article b = new Article("test", "test_content", cal.getTime());
        PaperArticle c = new PaperArticle("paper", "test_content", "papername");
        ElectronicArticle d = new ElectronicArticle("paper", "test_content", "papername");
        articles.add(a);
        articles.add(a1);
        articles.add(b);
        articles.add(c);
        articles.add(d);
    }


}
