package ss8_clean_code.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        int tempScore = 0;
        if (scoreOfPlayer1 == scoreOfPlayer2) {
            switch (scoreOfPlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
            boolean isAdvantageousPlayer1 = minusResult == 1;
            boolean isAdvantageousPlayer2 = minusResult == -1;
            boolean player1IsTheWinner = minusResult >= 2;
            if (isAdvantageousPlayer1) score = "Advantage player1";
            else if (isAdvantageousPlayer2) score = "Advantage player2";
            else if (player1IsTheWinner) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOfPlayer1;
                else {
                    score += "-";
                    tempScore = scoreOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
