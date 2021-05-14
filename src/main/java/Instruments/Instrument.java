package Instruments;

import behaviours.IPlay;
import shop.Item;

public abstract class Instrument extends Item implements IPlay {

    String brand;
    String model;

    public Instrument(double costPrice, double salePrice, String brand, String model){
        super(costPrice, salePrice);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }


}
