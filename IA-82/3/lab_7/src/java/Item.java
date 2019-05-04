

public class Item {
    private final String name;
    private final int recomendedPrice;
    
    public Item(String name, int price){
        this.recomendedPrice = price;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return recomendedPrice;
    }
}
