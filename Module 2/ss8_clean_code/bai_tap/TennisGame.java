package ss8_clean_code.bai_tap;

public class TennisGame {
    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final String DECUCE = "Deuce";
    private static final String ALL = "All";

    public static boolean isEqualScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        return scoreOfPlayer1 == scoreOfPlayer2;
    }

    public static boolean haveAtLeastFourpoints(int scoreOfPlayer1, int scoreOfPlayer2) {
        return scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4;
    }

    public static void getResultOfEqualScore(int scoreOfPlayer1, String score) {
        switch (scoreOfPlayer1) {
            case 0:
                score = LOVE + " - " + ALL;
                break;
            case 1:
                score = FIFTEEN + " - " + ALL;
                break;
            case 2:
                score = THIRTY + " - " + ALL;
                break;
            case 3:
                score = FORTY + " - " + ALL;
                break;
            default:
                score = DECUCE;
        }
    }

    public static void getResultOfAtLeast4Points(int scoreOfPlayer1, int scoreOfPlayer2, String score) {
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }

    public static void getResultOfLessThan4Points(int scoreOfPlayer1, int scoreOfPlayer2, String score) {
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                score += "-";
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
    }

    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        int tempScore = 0;
        if (isEqualScore(scoreOfPlayer1, scoreOfPlayer2)) {
            getResultOfEqualScore(scoreOfPlayer1, score);
        } else if (haveAtLeastFourpoints(scoreOfPlayer1, scoreOfPlayer2)) {
            getResultOfAtLeast4Points(scoreOfPlayer1, scoreOfPlayer2, score);
        } else {
            getResultOfLessThan4Points(scoreOfPlayer1, scoreOfPlayer2, score);
        }
        return score;
    }
}
