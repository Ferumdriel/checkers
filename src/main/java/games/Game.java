package games;

public class Game {
    public static void main(String[] args) {
        Board board = new Board(8,8);
        System.out.println(board.getBoardState());
        board.placePawns();
        System.out.println(board.getBoardState());
    }
}
