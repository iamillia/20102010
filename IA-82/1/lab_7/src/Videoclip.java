import java.util.Comparator;
import java.util.Objects;
public class Videoclip extends Song  {
    private String video;

    public Videoclip(String title_, String singer_, String video) {
        super(title_, singer_);
        this.video = video; }

    @Override
    public String toString() {
        return "Song{" + "title = '" + getTitle() +
                '\'' + "singer = '" + getSinger() +
                '\'' + "video = '" + getVideo() + '}'; }

    public String getVideo() {
        return video;
    }

    public void setVideo(String newVideo) {
        video = newVideo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        Videoclip videoclip = (Videoclip) o;
        return Objects.equals(getTitle(), song.getTitle()) &&
                Objects.equals(getSinger(), song.getSinger()) &&
                Objects.equals(getVideo(), videoclip.getVideo());}


    class VideoComparator implements Comparator<Videoclip>  {
        @Override
        public int compare(Videoclip o1, Videoclip o2) {
            return o1.getVideo().compareTo(o2.getVideo()); }
    }
}