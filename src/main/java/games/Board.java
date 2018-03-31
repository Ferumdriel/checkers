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
                tmpBoard[i][j] = new Field();
            }
        }
        return tmpBoard;
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
