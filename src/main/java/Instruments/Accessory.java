package Instruments;

import Instruments.instrumentTypes.AccessoryType;
import behaviours.ISell;
import shop.Item;



public class Accessory extends Item implements ISell {

    private String accessoryName;
    private AccessoryType accessoryType;

    public Accessory(double costPrice, double salePrice, String accessoryName, AccessoryType accessoryType) {
        super(costPrice, salePrice);
        this.accessoryName = accessoryName;
        this.accessoryType = accessoryType;
    }

    public String getAccessoryName() {
        return accessoryName;
    }


    public AccessoryType getAccessoryType() {
        return accessoryType;
    }
}
