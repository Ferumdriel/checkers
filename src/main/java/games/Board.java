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
        boardMatrix = initializeField();
    }

    private Field[][] initializeField(){
        return new Field[height][width];
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
        StringBuilder printBoard = new StringBuilder();
        for (Field[] row : boardMatrix) {
            for (Field fieldInRow : row) {
                if (fieldInRow == null) {
                    printBoard.append("z");
                } else {
                    printBoard.append("X");
                }
            }
            printBoard.append("\n");
        }
        return printBoard.toString();
    }
}
