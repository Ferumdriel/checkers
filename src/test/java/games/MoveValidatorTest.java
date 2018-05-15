package games;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MoveValidatorTest {
    MoveValidator moveValidator;
    Board board;
    Pawn pawn;
    @BeforeEach
    void setUp() throws Exception{
        board = new Board(8,8);
        pawn = new Pawn();
        board.placePawn(pawn, new Position(7,7));
        moveValidator = new MoveValidator(board);
    }

    @Test
    @DisplayName("Throws NotAllowedMove exception when trying to move out of board")
    void whenTryingToMoveFurtherThanBoardThenThrowException() throws NotAllowedMove {
        assertThrows(NotAllowedMove.class, () -> moveValidator.checkMove(MoveDirection.NE, pawn));
    }

    @Test
    void alwaysFails(){
        assertTrue(false);
    }

}