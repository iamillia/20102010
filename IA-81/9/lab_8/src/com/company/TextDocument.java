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

    static class IdComparator implements Comparator<Document> {

        public int compare(Document d1, Document d2) {
            return Integer.compare(d1.getId(), d2.getId());
        }
    }

    @Override
    public String toString() {
        return "TextDocument:"+
                ", typeOfSecrecy {'" +getTypeOfSecrecy()+"}"+
                ", id= " +getId()+
                ", docType {"+this.docType+"}";
    }
}
