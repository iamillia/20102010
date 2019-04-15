import java.util.Comparator;
import java.util.Objects;

public  class Song {
    private String title;
    private String singer;

    public Song(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String newTitle) {

        title = newTitle;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String newSinger) {
        singer = newSinger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(getTitle(), song.getTitle()) &&
                Objects.equals(getSinger(), song.getSinger());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getSinger());
    }
      static class NameComparator implements Comparator<Song> {


          @Override
        public int compare(Song o1, Song o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }

        @Override
        public Comparator<Song> thenComparing(Comparator<? super Song> other) {
            return null;
        }
    }

}
