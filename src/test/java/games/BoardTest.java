package games;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board board;

    @BeforeEach
    void setUp() {
    }

    @Test
    void whenInstantiatingSquareBoardThenSquareMatrixIsCreated(){
        board = new Board(5);
        assertFalse(board.getHeight()==0);
        assertTrue(board.getHeight()==board.getWidth());
        assertTrue(board.getBoardMatrix().length==board.getHeight());
        assertTrue(board.getBoardMatrix()[0].length==board.getWidth());
    }

    @Test
    void showGetBoardState(){
        board = new Board(5, 8);
        System.out.println(board.getBoardState());
    }

}