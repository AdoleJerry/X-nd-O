import org.example.dependency.TicTacToeGame;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeGameTest {

    @Test
    public void testCheckWin() {
        TicTacToeGame game = new TicTacToeGame();

        // Test horizontal win
        game.setCell(0, 0, 'X');
        game.setCell(0, 1, 'X');
        game.setCell(0, 2, 'X');
        assertTrue(game.checkWin('X'));

        // Test vertical winjava
        game.reset();
        game.setCell(0, 0, 'O');
        game.setCell(1, 0, 'O');
        game.setCell(2, 0, 'O');
        assertTrue(game.checkWin('O'));

        // Test diagonal win
        game.reset();
        game.setCell(0, 0, 'X');
        game.setCell(1, 1, 'X');
        game.setCell(2, 2, 'X');
        assertTrue(game.checkWin('X'));

        // Test no win
        game.reset();
        game.setCell(0, 0, 'O');
        game.setCell(1, 1, 'X');
        game.setCell(2, 2, 'O');
        assertFalse(game.checkWin('O'));
    }

    @Test
    public void testReset() {
        TicTacToeGame game = new TicTacToeGame();

        game.setCell(0, 0, 'X');
        game.setCell(0, 1, 'O');
        game.reset();

        assertNull(game.getCell(0, 0));
        assertNull(game.getCell(0, 1));
        assertNull(game.getCell(1, 0));
    }

    @Test
    public void testDraw() {
        TicTacToeGame game = new TicTacToeGame();

        game.setCell(0, 0, 'X');
        game.setCell(0, 1, 'O');
        game.setCell(0, 2, 'X');
        game.setCell(1, 0, 'O');
        game.setCell(1, 1, 'X');
        game.setCell(1, 2, 'O');
        game.setCell(2, 0, 'O');
        game.setCell(2, 1, 'X');
        game.setCell(2, 2, 'O');

        assertTrue(game.draw());
    }
}