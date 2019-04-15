import java.util.ArrayList;
import java.util.Iterator;

public class Model {
    public ArrayList<Actors> minFilmsFind(DataBase dataBase) {
        ArrayList<Actors> badActors = new ArrayList<>();
        for (Actors actor : dataBase.ListOfActors) {
            if (actor.ListOfFilms.size() == 0) {
                badActors.add(actor);
            }
        }
        System.out.println("Actor with no films is:");
        return badActors;
    }

    public ArrayList<Actors> sameFilms(DataBase dataBase,Actors actor_find){
        if (!dataBase.ListOfActors.contains(actor_find)){
            System.out.println("Sorry, but we don know this actor");
            return null;
        }
        ArrayList<Actors> coActors = new ArrayList<Actors>();
        Iterator<Films> iterator = actor_find.ListOfFilms.iterator();
        while(iterator.hasNext()){
            for(Actors actor: iterator.next().ListOfActors) {
                if(!(coActors.contains(actor) || actor == actor_find)) {
                    coActors.add(actor);
                }
            }

        }
        System.out.println("Actor "+actor_find+" has played with: ");
        return coActors;
    }

    public Films maxActors(DataBase dataBase){
        int max = dataBase.ListOfActors.size();
        Films maxActorsFilm = null;
        Iterator<Actors> iterator = dataBase.ListOfActors.iterator();
        while(iterator.hasNext()){
            for(Films films: iterator.next().ListOfFilms) {
                if(dataBase.ListOfActors.size()>max) {
                    max=dataBase.ListOfActors.size();
                }
                maxActorsFilm = films;
            }

        }
        System.out.println("Film wirh max amount of actors " );
        return maxActorsFilm;
    }

    public ArrayList<Actors> getActors(DataBase dataBase){
        return dataBase.ListOfActors;
    }

}
