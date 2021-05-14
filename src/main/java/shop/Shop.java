package shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> shopStock;
    private String shopName;

    public Shop(String shopName){
        this.shopName = shopName;
        this.shopStock = new ArrayList<>();
    }

    public void addItemToStock(Item item){
        shopStock.add(item);
    }

    public void removeItemFromStock(Item item){
        shopStock.remove(item);
    }

    public String getShopName() {
        return shopName;
    }

    public int getStockCount(){
        return this.shopStock.size();
    }

    public Item getStockItem(int index){
        return this.shopStock.get(index);
    }

    public double getStockProfit(){
        double totalProfit = 0;
        for(Item item : this.shopStock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
