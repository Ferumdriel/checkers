package games;

public class Field {
    private Position position;
    private Pawn pawn;
    private Marker currentMarker = Marker.FREE;

    public Field(int x, int y) {
        this.position = new Position(x, y);
    }

    public boolean isFieldTaken() {
        return pawn != null;
    }

    public void freeField(){
        pawn.setPosition(null);
        pawn = null;
        currentMarker = Marker.FREE;
    }

    public void takeField(Pawn pawn){
        this.pawn = pawn;
        pawn.setPosition(position);
        currentMarker = Marker.PAWN;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public char getFieldStatus(){
        return currentMarker.getMark();
    }
}
