
import java.util.*;


public class OnlineStore {
    public final String name;
    private HashMap<Item, Integer> productPriceList;

    public OnlineStore(String name) {
        this.productPriceList = new HashMap<>();
        this.name = name;
    }
    
    public void addNewLot(Item item, int price){
        productPriceList.put(item, price);
    }
    
    public void deleteLot(Item item){
        productPriceList.remove(item);
    }
    
    public int getPriceOfLot(Item item){
        return productPriceList.get(item);
    }
    
    public String getName(){
        return name;
    }
    
    public HashMap<Item, Integer> getProductPriceList(){
        return productPriceList;
    }
}
