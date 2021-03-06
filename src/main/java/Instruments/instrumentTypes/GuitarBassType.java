package Instruments.instrumentTypes;

public enum GuitarBassType {
    ELECTRICGUITAR(6),
    ACOUSTICGUITAR(6),
    ELECTRICBASS(4),
    ELECTRIC12(12),
    ACOUSTIC12(12),
    ELECTRICBASS5(5),
    ELECTRICBASSVI(6);

    private final int stringNumber;

    GuitarBassType(int stringNumber){
        this.stringNumber = stringNumber;
    }

    public int getStringNumber(){
        return this.stringNumber;
    }
}
