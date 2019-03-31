package com.company;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/Сontroller")
public class Сontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Basa basa = new Basa();
        basa.getActors().add(new Actor(" Tara Donna Reid", Arrays.asList("A Return to Salem’s Lot", "Just Visiting")));
        basa.getActors().add(new Actor("petro", Arrays.asList()));
        basa.getActors().add(new Actor("Evelyn Keyes", Arrays.asList("A Return to Salem’s Lot")));
        basa.getFilms().add(new Film("A Return to Salem’s Lot", Arrays.asList("Evelyn Keyes","Tara Donna Reid")));
        basa.getFilms().add(new Film("Union Pacific", Arrays.asList("Evelyn Keyes")));

        String actor = request.getParameter("actor");
        Model model = new Model();
        int task1 = model.max(basa);
        boolean task3 = model.NoFilm(basa);
        List<String> list = model.InOneFilm(actor,basa);

        request.setAttribute("task1", task1);
        request.setAttribute("task3",task3);
        request.setAttribute("task2",list);
        request.setAttribute("b",basa);
        request.getRequestDispatcher("View.jsp").forward(request,response);
    }
}
