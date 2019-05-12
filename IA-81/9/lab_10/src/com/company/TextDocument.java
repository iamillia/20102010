package com.company;

import java.util.Comparator;

public class TextDocument extends Document{
    public String docType;

    public TextDocument(String typeOfSecrecy,
                        int id,
                        String docType) {
        super(typeOfSecrecy, id);
        this.docType = docType;

    }

    public String getdocType() {
        return docType;
    }

    public TextDocument setdocType(String docType) {
        TextDocument cloneTextDoc = new TextDocument( getTypeOfSecrecy(), getId(), getdocType());
        cloneTextDoc.docType = docType;
        return cloneTextDoc;
    }


    @Override
    public String toString() {
        return "TextDocument:"+
                ", typeOfSecrecy {'" +getTypeOfSecrecy()+"}"+
                ", id= " +getId()+
                ", docType {"+this.docType+"}";
    }
}