package com.company;
import java.util.Comparator;
public class EDocument extends Document {
    private String typeOfCarrier;
    private String docForm;
    private String typeOfContent;
    public EDocument(String typeOfSecrecy, int id, String typeOfCarrier, String docForm,String typeOfContent) {
        super( typeOfSecrecy, id);
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
     class EdocIdCompporator implements Comparator<EDocument> {
        @Override
        public int compare(EDocument o1, EDocument o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    }

    @Override
    public String toString() {
        return "TextDocument:"+
                ", type Of Secrecy {'" +getTypeOfSecrecy()+"}"+
                ", id= " +getId()+
                ", type of content {"+this.typeOfContent+"}"+
                ", typeOfCarrier {"+this.typeOfCarrier+"}"+
                ", docForm {"+this.docForm+"}";
    }
}


