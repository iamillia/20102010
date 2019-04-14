import java.util.ArrayList;

public class Films {
    private String title;
    ArrayList<Actors> ListOfActors;

    public Films(String title, ArrayList<Actors> listOfActors) {
        this.title = title;
        this.ListOfActors = listOfActors;
    }

    public ArrayList<Actors> getListOfActors() {
        return ListOfActors;
    }

    @Override
    public String toString() {
        return "Film:" +
                " '"+title + "' ";
    }
}