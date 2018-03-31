package games;

public enum Marker {
    PAWN('O'),
    FREE('x');

    private final char mark;

    Marker(char mark){
        this.mark = mark;
    }

    public char getMark() {
        return mark;
    }
}
