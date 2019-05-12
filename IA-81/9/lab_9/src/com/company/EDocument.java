package com.company;
import java.util.Comparator;
import java.util.Date;

public class EDocument extends Document {
    private String typeOfCarrier;
    private String docForm;
    private String typeOfContent;
    public EDocument(String typeOfSecrecy, int id, Date date, String typeOfCarrier, String docForm, String typeOfContent) {
        super( typeOfSecrecy, id, date);
        this.docForm = docForm;
        this.typeOfCarrier = typeOfCarrier;
        this.typeOfContent = typeOfContent;
    }

    public String getTypeOfCarrier() {
        return typeOfCarrier;
    }

    public void setTypeOfCarrier(String typeOfCarrier) {
        this.typeOfCarrier = typeOfCarrier;
    }

    public String getDocForm() {
        return docForm;
    }

    public void setDocForm(String docForm) {
        this.docForm = docForm;
    }

    public String getTypeOfContent() {
        return typeOfContent;
    }

    public void setTypeOfContent(String typeOfContent) {
        this.typeOfContent = typeOfContent;
    }



    @Override
    public String toString() {
        return "E-Document:"+
                ", type Of Secrecy {'" +getTypeOfSecrecy()+"}"+
                ", id= " +getId()+
                ", date of adding: "+getDate()+
                ", type of content {"+this.typeOfContent+"}"+
                ", typeOfCarrier {"+this.typeOfCarrier+"}"+
                ", docForm {"+this.docForm+"}";
    }
}


