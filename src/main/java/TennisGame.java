public class TennisGame {
    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public String getScore() {
        String playerOneScoreName = "";
        String playerTwoScoreName = "";

        if(playerOneScore == 0) {
            playerOneScoreName = "Love";
        }

        if(playerTwoScore == 0) {
            playerTwoScoreName = "Love";
        }

        return playerOneScoreName + ", " + playerTwoScoreName;
    }
}
