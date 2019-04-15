import java.util.ArrayList;

public class Actors {
    private String Firstname;
    private String Lastname;
    ArrayList<Films> ListOfFilms;

    public Actors(String firstname, String lastname, ArrayList<Films> listOfFilms) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.ListOfFilms=listOfFilms;
    }

    public String getName(){
        return Firstname+" "+Lastname;
    }

    public ArrayList<Films> getListOfFilms() {
        return ListOfFilms;
    }

    @Override
    public String toString() {
        return "Actor:"+ Firstname + ' ' +
                Lastname +"";
    }
}
