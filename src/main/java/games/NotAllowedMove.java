package games;

public class NotAllowedMove extends Exception {

    public NotAllowedMove(){

    }

    public NotAllowedMove(Exception e){
        super(e);
    }
}
