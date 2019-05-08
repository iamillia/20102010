

public class Movie extends Song {
    private double length;
    private long numbersOfLikes;




    public long getNumbersOfLikes() {
        return numbersOfLikes;
    }

    Movie(String name) {
        super(name);
    }

    Movie(double length, long numbersOfLikes, String name) {
        this(name);
        this.length = length;
        this.numbersOfLikes = numbersOfLikes;
    }



    @Override
    public String toString() {
        return
                "Тривалість відео та пісні +" + length + '\n' +
                        "Кількість лайків: " + numbersOfLikes + '\n' +
                        "назва пісні: " + getName() + '\n';

    }
    public String getName(){
        return super.getName();
    }
}