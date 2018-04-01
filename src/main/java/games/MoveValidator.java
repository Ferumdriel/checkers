package games;

public class MoveValidator {
    private Board board;

    public MoveValidator(Board board){
        this.board = board;
    }

    public void checkMove(MoveDirection dir, Pawn pawn) throws NotAllowedMove{
        Position currentPosition = pawn.getField().getPosition();
        switch(dir){
            case NE:
                Position destinationPosition = new Position(currentPosition.getX()+1,currentPosition.getY()-1);
                board.placePawn(pawn, destinationPosition);
        }
    }
}
