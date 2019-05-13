package com.company;

public class check {
    videoclip videoclip;
    Boolean check;
    public check(videoclip videoclip, boolean check){
        this.videoclip = videoclip;
        this.check = check;
    }
    public check(videoclip videoclip){
        this.videoclip = videoclip;
    }


    @Override
    public String toString() {
        return "check{" +
                "videoclip=" + videoclip +
                ", check=" + check +
                '}';
    }
}

