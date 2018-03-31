package games;

public class Field {
    private Pawn pawn;
    private Marker currentMarker = Marker.FREE;

    public boolean isFieldTaken() {
        return pawn != null;
    }

    public void freeField(){
        pawn = null;
        currentMarker = Marker.FREE;
    }

    public void takeField(Pawn pawn){
        this.pawn = pawn;
        currentMarker = Marker.PAWN;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public char getFieldStatus(){
        return currentMarker.getMark();
    }
}
