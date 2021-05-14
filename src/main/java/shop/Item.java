package shop;

import behaviours.ISell;

public abstract class Item implements ISell {

    double costPrice;
    double salePrice;

    public Item(double costPrice, double salePrice){
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkup(){
        return this.salePrice - this.costPrice;
    }
}
