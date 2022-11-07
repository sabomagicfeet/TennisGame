import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisGameTest {

    private TennisGame game = new TennisGame();

    @Test
    public void getscoreTest() {
        // Arrange
        String expected = "Love, Love";

        // Act
        String actual = game.getScore();

        // Assert
        Assertions.assertEquals(expected, actual);

    }

    // 0 - Love
    // 1 - 15
    // 2 - 30
    // 3 - 40



}
