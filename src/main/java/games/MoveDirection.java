package games;

public enum MoveDirection {
    NE("NE"),
    SE("SE"),
    NW("NW"),
    SW("SW");

    private String direction;

    MoveDirection(String direction){
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
