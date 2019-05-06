import java.util.*;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class Laba10 implements ServletContextListener {
    
    public static HashMap<String, Item> items;
    public static HashMap<String, OnlineStore> stores;
    public static ProductSearchService service;
        
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        Item xiaomi = new Item("XiaomiRedmiNote", 6737);
        Item meizu = new Item("MeizuM6", 3521);
        Item qukitel = new Item("Qukitel", 2323);
        Item hompton = new Item("Homtion", 1228);
        Item lenovo = new Item("LenovoA5", 3700);
        
        items = new HashMap<>();
        items.put("MeizuM6", meizu);
        items.put("XiaomiRedmiNote", xiaomi);
        items.put("Qukitel", qukitel);
        items.put("Homtion", hompton);
        items.put("LenovoA5", lenovo);
        
        OnlineStore ali = new OnlineStore("AliExpress");
        ali.addNewLot(xiaomi, 3000);
        ali.addNewLot(meizu, 2000);
        ali.addNewLot(qukitel, 2100);
        ali.addNewLot(hompton, 1200);
        ali.addNewLot(lenovo, 3600);
        
        OnlineStore rozetka = new OnlineStore("Rozetka");
        rozetka.addNewLot(xiaomi, 7000);
        rozetka.addNewLot(meizu, 4000);
        rozetka.addNewLot(qukitel, 3100);
        rozetka.addNewLot(hompton, 200);
        rozetka.addNewLot(lenovo, 3600);
        
        OnlineStore gearbest = new OnlineStore("GearBest");
        gearbest.addNewLot(xiaomi, 7000);
        gearbest.addNewLot(meizu, 5000);
        gearbest.addNewLot(qukitel, 1100);
        gearbest.addNewLot(hompton, 2200);
        gearbest.addNewLot(lenovo, 3600);
        
        stores = new HashMap<>();
        stores.put("Rozetka", rozetka);
        stores.put("AliExpress", ali);
        stores.put("GearBest", gearbest);
        
        service = new ProductSearchService();
        service.addStore(ali);
        service.addStore(rozetka);
        service.addStore(gearbest);
    }
    
    public static void minPriceForLot(Item item, ProductSearchService service){
        System.out.println("minPrice: " + service.minPriceForLot(item));
    }

    public static ArrayList<OnlineStore> getMinPriceLotStores(Item item,ProductSearchService service){
        ArrayList<OnlineStore> minPriceLotStores = service.getMinPriceLotStores(item);
        return minPriceLotStores;
    }
    
    public static ArrayList<OnlineStore> getMinPriceLotStores(String item){
        return getMinPriceLotStores(items.get(item), service);
    }
  
    public static boolean existsSuspiciousStore(ProductSearchService service){
        return service.existsSuspiciousStore();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
