package Instruments;

import Instruments.instrumentTypes.KeyboardType;

public class Keyboard extends Instrument {

    private KeyboardType keyboardType;

    public Keyboard(double costPrice, double salePrice,String brand, String model, KeyboardType keyboardType){
        super(costPrice, salePrice, brand, model);
        this.keyboardType = keyboardType;
    }

    public KeyboardType getKeyboardType(){
        return this.keyboardType;
    }

    public int getNumberOfKeysFromEnum(){
        return this.keyboardType.getNumberOfKeys();
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String playInstrument() {
        return "Plinky Plonky";
    }
}

