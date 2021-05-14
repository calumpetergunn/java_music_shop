package Instruments;

import Instruments.instrumentTypes.GuitarBassType;

public class GuitarBass extends Instrument {

    private GuitarBassType guitarBassType;

    public GuitarBass(double costPrice, double salePrice,String brand, String model, GuitarBassType guitarBassType){
        super(costPrice, salePrice, brand, model);
        this.guitarBassType = guitarBassType;
    }

    public GuitarBassType getGuitarBassType(){
        return this.guitarBassType;
    }

    public int getStringNumberFromEnum(){
        return this.guitarBassType.getStringNumber();
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String playInstrument() {
        return "Widdly widdly woo";
    }
}
