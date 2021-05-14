package Instruments.instrumentTypes;

public enum DrumType {
    FULLKIT(12),
    BOSSANOVAKIT(7),
    RACKKIT(1),
    KIDSKIT(5);

    private final int kitPieces;

    DrumType(int kitPieces){
        this.kitPieces = kitPieces;
    }

    public int getSizeOfKit() {
        return kitPieces;
    }
}
