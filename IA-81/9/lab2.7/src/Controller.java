import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class Controller extends HttpServlet {
    public Actors translate (DataBase dataBase,String actorr){
        Actors act = null;
        for (Actors actor:dataBase.ListOfActors) {
            if (actor.getName().equals(actorr)){
                act = actor;
            }
        }
        return  act;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Actors> actorsFilm1 = new ArrayList<>(),
                actorsFilm2 = new ArrayList<>(),
                actorsFilm3 = new ArrayList<>(),
                actorsFilm4 = new ArrayList<>();
        ArrayList<Films> actor1Films = new ArrayList<>(),
                actor2Films = new ArrayList<>(),
                actor3Films = new ArrayList<>(),
                actor4Films = new ArrayList<>(),
                actor5Films = new ArrayList<>();
        ArrayList<Actors> allActors = new ArrayList<>();
        ArrayList<Films>  allFilms = new ArrayList<>();
        DataBase generalList = new DataBase(allFilms,allActors);
        Films film1= new Films("Pirates of the Caribian",actorsFilm1);

        Films film2 = new Films("Black Mass",actorsFilm2);

        Films film3 = new Films("Hoobit:Desolation of Smaug",actorsFilm3);

        Films film4 = new Films("Fantastic tvari and hde oni obitajut",actorsFilm4);

        Actors actor1 = new Actors("Johnny","Depp",actor1Films);

        Actors actor2 = new Actors ("Orlando","Bloom",actor2Films);

        Actors actor3 = new Actors("Benedict","Cumberbatch",actor3Films);

        Actors actor4 = new Actors("Marthin","Freeman",actor4Films);

        Actors actor5 = new Actors("Volodimyr","Horianskyj",actor5Films);

        actor1Films.add(film1);
        actor1Films.add(film2);
        actor1Films.add(film4);
        actor2Films.add(film1);
        actor2Films.add(film3);
        actor3Films.add(film3);
        actor3Films.add(film2);
        actor4Films.add(film3);

        actorsFilm1.add(actor1);
        actorsFilm1.add(actor2);
        actorsFilm2.add(actor1);
        actorsFilm2.add(actor3);
        actorsFilm3.add(actor2);
        actorsFilm3.add(actor3);
        actorsFilm3.add(actor4);
        actorsFilm4.add(actor1);

        allActors.add(actor1);
        allActors.add(actor2);
        allActors.add(actor3);
        allActors.add(actor4);
        allActors.add(actor5);

        allFilms.add(film1);
        allFilms.add(film2);
        allFilms.add(film3);
        allFilms.add(film4);

        Model model = new Model();


        ArrayList<Actors> minFilms = model.minFilmsFind(generalList);
        Films maxActor = model.maxActors(generalList);
        int option = 0;
        String radioVlue = req.getParameter("radioValue");
        switch (radioVlue){
            case "allActors":
                option =1;
                break;
            case "allFilms":
                option = 2;
                break;
            case "minFilmsActor":
                req.getSession().setAttribute("minFilms", minFilms);
                option = 3;
                break;
            case  "coActors":
                String actorr = req.getParameter("actor");
                if (actorr.equals("")){
                    resp.sendError(406,"U enetered nothing");
                    return;
                }
                Actors actor = translate(generalList,actorr);
                if(actor == null){
                    req.setAttribute("ListOfActors",generalList.ListOfActors);
                    req.setAttribute("WrongActor",actorr);
                    option=4;
                    break;
                }
                ArrayList<Actors> coActors = model.sameFilms(generalList,actor);
                req.setAttribute("coActors",coActors);
                option = 4;
                break;
            case "maxActor":
                req.setAttribute("maxActor",maxActor);
                option = 5;
                break;
            default:
                resp.sendError(418,"No idea how u did this mate");
                return;
        }
        req.setAttribute("option",option);
        req.setAttribute("base",generalList);
        req.getRequestDispatcher("View.jsp").forward(req,resp);
    }

}
