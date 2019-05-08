import java.util.Date;

public class ElectronicArticle extends Article {
    private String website;

    ElectronicArticle(String title, String content, String website) {
        super(title, content);
        this.website = website;
    }

    public ElectronicArticle(String title, String content, Date publicationDate, String website) {
        super(title, content, publicationDate);
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Website: " + website + "\n";
    }
}
