import java.util.Date;

public class PaperArticle extends Article {
    private String newspaperName;

    PaperArticle(String title, String content, String newspaperName) {
        super(title, content);
        this.newspaperName = newspaperName;
    }

    public PaperArticle(String title, String content, Date publicationDate, String newspaperName) {
        super(title, content, publicationDate);
        this.newspaperName = newspaperName;
    }

    public String getNewspaperName() {
        return newspaperName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Newspaper name: " + newspaperName + "\n";
    }
}
