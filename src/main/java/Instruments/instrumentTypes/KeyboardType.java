package Instruments.instrumentTypes;

public enum KeyboardType {
    GRANDPIANO(88),
    ELECTRICPIANO(61),
    RHODES(73),
    SYNTHESIZER(24);

    private final int numberOfKeys;

    KeyboardType(int numberOfKeys){
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

}
