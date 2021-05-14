package Instruments;

import Instruments.instrumentTypes.DrumType;

public class Drums extends Instrument {

    private DrumType drumType;

    public Drums(double costPrice, double salePrice,String brand, String model, DrumType drumType){
        super(costPrice, salePrice, brand, model);
        this.drumType = drumType;

    }
    public DrumType getDrumType(){
        return this.drumType;
    }

    public int getSizeOfKitFromEnum(){
        return this.drumType.getSizeOfKit();
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String playInstrument() {
        return "Badum bum tssssshh";
    }
}
