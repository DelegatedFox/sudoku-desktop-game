package models;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import sudoku.model.models.SudokuBoard;
import sudoku.model.solver.BacktrackingSudokuSolver;

public class SudokuValidationTest {
    SudokuBoard board = new SudokuBoard(new BacktrackingSudokuSolver());

@Test
    void testDuplicateValueInRowReturnsInvalid() {
        
        // Two 5s in the same row
        board.setField(0, 0, 5);
        board.setField(1, 0, 5); 
        
        assertFalse(board.isValidSudoku(), "The board should detect duplicate numbers in a row as invalid.");
    }

    @Test
    void testDuplicateValueInColumnReturnsInvalid() {
        
        // Two 9s in the same column
        board.setField(0, 0, 9);
        board.setField(0, 1, 9); 
        
        assertFalse(board.isValidSudoku(), "The board should detect duplicate numbers in a column as invalid.");
    }

}
