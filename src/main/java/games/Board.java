package games;

public class Board {
    public int height;
    public int width;
    public Field[][] boardMatrix;

    public Board(int sameSize){
        this(sameSize, sameSize);
    }

    public Board(int height, int width){
        this.height = height;
        this.width = width;
        boardMatrix = initializeField(height, width);
    }

    private Field[][] initializeField(int height, int width) {
        Field[][] tmpBoard = new Field[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tmpBoard[i][j] = new Field(i,j);
            }
        }
        sout ('hehe')
        return tmpBoard;
    }

    public void placePawn(Pawn pawn, Position position) throws NotAllowedMove {
        try {
            boardMatrix[position.getX()][position.getY()].takeField(pawn);
        }catch(ArrayIndexOutOfBoundsException e){
            throw new NotAllowedMove(e);
        }
    }

    public void placePawns(){
        for(int i = 0; i < width; i += 2){
            boardMatrix[height-1][i].takeField(new Pawn());
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Field getField(Position position){
        return boardMatrix[position.getX()][position.getY()];
    }

    public Field[][] getBoardMatrix() {
        return boardMatrix;
    }

    public String getBoardState(){
        StringBuilder visualisedMatrix = new StringBuilder();
        for (Field[] row : boardMatrix) {
            for (Field fieldInRow : row) {
                if (fieldInRow.isFieldTaken()) {
                    visualisedMatrix.append("X");
                } else {
                    visualisedMatrix.append("z");
                }
            }
            visualisedMatrix.append("\n");
        }
        return visualisedMatrix.toString();
    }
}
