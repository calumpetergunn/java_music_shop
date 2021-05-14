package shop;

public abstract class Item {

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
}
