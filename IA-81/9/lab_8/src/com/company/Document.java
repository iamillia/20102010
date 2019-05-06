package com.company;
public class Document {
    private final  String typeOfSecrecy;
    private final  int id;

    public Document(String typeOfSecrecy, int id) {
        this.typeOfSecrecy = typeOfSecrecy;
        this.id = id;

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

}



