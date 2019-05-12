package com.company;

import java.util.Date;

public class TextDocument extends Document{
    public String docType;

    public TextDocument(String typeOfSecrecy,
                        int id,
                        Date date,
                        String docType) {
        super(typeOfSecrecy, id,date);
        this.docType = docType;

    }

    public String getdocType() {
        return docType;
    }

    public TextDocument setdocType(String docType) {
        TextDocument cloneTextDoc = new TextDocument( getTypeOfSecrecy(), getId(),getDate(), getdocType());
        cloneTextDoc.docType = docType;
        return cloneTextDoc;
    }

    @Override
    public String toString() {
        return "TextDocument:"+
                ", typeOfSecrecy {'" +getTypeOfSecrecy()+"}"+
                ", id= " +getId()+
                ", date of adding: "+getDate()+
                ", docType {"+this.docType+"}";
    }
}
