import java.util.Date;

public class Article {
    private String title;
    private String content;
    private Date publicationDate;

    Article(String title, String content) {
        this(title, content, new Date());
    }

    Article(String title, String content, Date publicationDate) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Content: " + content + "\n" +
                "Publication date: " + publicationDate + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Article)) return false;

        return (title.equals(((Article) obj).title)) &&
                (content.equals(((Article) obj).content)) &&
                (publicationDate.equals(((Article) obj).publicationDate));
    }
}
