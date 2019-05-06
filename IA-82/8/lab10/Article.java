package laba10_2;

import java.util.Comparator;

public class Article {
    private int num_pages;
    private String title;
    private String text;
    private String author;



    public Article( int num_pages, String title, String text, String author) {
        this.num_pages=num_pages;
        this.title=title;
        this.text=text;
        this.author=author;
    }


    public int getNum_pages() {
        return num_pages; }

    public void setNum_pages(int num_pages) {
        if (num_pages<0){
            throw new   IllegalArgumentException("КІЛЬКІСТЬ СТОРІНОК НЕ МОЖЕ БУТИ ВІД'ЄМНОЮ");
        }
        this.num_pages = num_pages; }


    public  String getText() {
        return text; }

    public void setText(String text) {
        this.text = text; }


    public String getTitle() {
        return title; }

    public void setTitle(String title) {
        this.title = title; }


    public String getAuthor() {
        return author; }

    public void setAuthor(String author) {
        this.author = author; }





    @Override
    public String toString() {

        return "Author: " + author +  " - '" + title + "' ";
//                "      Number of pages: " + num_pages + '\n'+
//
//                "     " + text   ;
    }






}
