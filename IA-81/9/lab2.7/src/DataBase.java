import java.util.ArrayList;
import java.util.Iterator;

public class DataBase {
    public ArrayList<Films> ListOfFilms ;
    public ArrayList<Actors> ListOfActors;

    public DataBase(ArrayList<Films> listOfFilms, ArrayList<Actors> listOfActors) {
        this.ListOfFilms = listOfFilms;
        this.ListOfActors = listOfActors;

    }
    public ArrayList<Actors> getActors(){
        return ListOfActors;
    }
    public ArrayList<Films> getFilms() {
        return ListOfFilms;
    }

    @Override
    public String toString() {
        return "DataBase.\n" +
                "ListOfFilms: " + this.ListOfFilms +"\n"+
                "ListOfActors: " + this.ListOfActors;
    }
}
