
import java.util.*;


public class ProductSearchService {
    private ArrayList<OnlineStore> storeList;
    
    public ProductSearchService(){ 
        storeList = new ArrayList<>();
    }
    
    public ProductSearchService(ArrayList<OnlineStore> store){
        storeList = store;
    }
    
    public void addStore(OnlineStore store){
        storeList.add(store);
    }
    
    public void removeStore(OnlineStore store){
        storeList.remove(store);
    }
    
    public ArrayList<OnlineStore> getStoreList(){
        return storeList;
    }
    
    public int minPriceForLot(Item item){
        if(getStoreList().get(0) == null){
            throw new IllegalArgumentException("storeList empty");
        }
        int minPrice = getStoreList().get(0).getPriceOfLot(item);
        for(OnlineStore s: getStoreList()){
                if(s.getProductPriceList().get(item) < minPrice){
                    minPrice = s.getProductPriceList().get(item);
                }
        }
     
        return minPrice;
    }
    
    public ArrayList<OnlineStore>getMinPriceLotStores(Item item){
        int minPrice = minPriceForLot(item);
        ArrayList<OnlineStore> minPriceLotStores = new ArrayList<>();
        for(Iterator<OnlineStore> s = getStoreList().iterator(); s.hasNext();){
            OnlineStore os = s.next();
            if(minPrice == os.getPriceOfLot(item)){
                minPriceLotStores.add(os);
            }
        }
     
        return minPriceLotStores;
    }
    
    public boolean existsSuspiciousStore( ){
        boolean flag = true;
        for(OnlineStore s: getStoreList()){
            flag = true;
            for(Iterator i = s.getProductPriceList().keySet().iterator(); i.hasNext();){
                Object item = i.next();
                if(((Item)item).getPrice() <= s.getProductPriceList().get((Item)item)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
