package com.company;

import java.util.Date;

public class Document {
    private final  String typeOfSecrecy;
    private final  int id;
    private Date date;


    public Document(String typeOfSecrecy, int id, Date date) {
        this.typeOfSecrecy = typeOfSecrecy;
        this.id = id;
        this.date=date;

    }


    public String getTypeOfSecrecy() {
        return typeOfSecrecy;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Document " +
                ", typeOfSecrecy= '" + typeOfSecrecy + '\'' +
                ", id= " + id;
    }

    public Date getDate() {
        return date;
    }
}



