package TheCore.Chess

public class AmazonCheckmate {
    public static void main(String[] args) {

    }
    enum Position {
        CHECKMATE,
        CHECK,
        STALEMATE,
        SAFE,
        INVALID,
    }

    int[] solution(String king, String amazon) {
        int kingI = king.charAt(0) - 'a';
        int kingJ = king.charAt(1) - '1';
        int amazonI = amazon.charAt(0) - 'a';
        int amazonJ = amazon.charAt(1) - '1';

        int[] positionCounts = new int[4];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Position position = estimatePosition(i, j, kingI, kingJ, amazonI, amazonJ);
                if (position != Position.INVALID) positionCounts[position.ordinal()]++;
            }
        }
        return positionCounts;
    }

    Position estimatePosition(int blackKingI, int blackKingJ, int whiteKingI, int whiteKingJ, int amazonI, int amazonJ) {
        Position position = Position.STALEMATE;
        if (isTooClose(blackKingI, blackKingJ, whiteKingI, whiteKingJ)) position = Position.INVALID;
        else if (isSame(blackKingI, blackKingJ, amazonI, amazonJ)) position = Position.INVALID;
        else {
            boolean isCheck = isCheck(blackKingI, blackKingJ, whiteKingI, whiteKingJ, amazonI, amazonJ);
            boolean hasMove = hasMove(blackKingI, blackKingJ, whiteKingI, whiteKingJ, amazonI, amazonJ);
            if (isCheck && hasMove) position = Position.CHECK;
            else if (isCheck && !hasMove) position = Position.CHECKMATE;
            else if (!isCheck && hasMove) position = Position.SAFE;
        }
        return position;
    }

    boolean isTooClose(int i, int j, int whiteKingI, int whiteKingJ) {
        return i >= whiteKingI-1 && i <= whiteKingI+1
                && j >= whiteKingJ-1 && j <= whiteKingJ+1;
    }

    boolean isSame(int i, int j, int x, int y) {
        return i == x && j == y;
    }

    boolean isProtected(int blackKing, int whiteKing, int amazon) {
        return ((whiteKing > blackKing && whiteKing < amazon) ||
                (whiteKing > amazon && whiteKing < blackKing));
    }

    boolean isCheck(int blackKingI, int blackKingJ, int whiteKingI, int whiteKingJ, int amazonI, int amazonJ) {
        //within 2 spaces away from amazon
        if (blackKingI >= amazonI-2 && blackKingI <= amazonI+2
                && blackKingJ >= amazonJ-2 && blackKingJ <= amazonJ+2) return true;
        //same column
        if (blackKingI == amazonI) {
            if (whiteKingI != blackKingI) return true;
            //check if protected
            return !isProtected(blackKingJ, whiteKingJ, amazonJ);
        }
        //same row
        if (blackKingJ == amazonJ) {
            if (whiteKingJ != blackKingJ) return true;
            //check if protected
            return !isProtected(blackKingI, whiteKingI, amazonI);
        }
        //same main diagonal
        if (blackKingI - blackKingJ == amazonI - amazonJ) {
            if (whiteKingI - whiteKingJ != blackKingI - blackKingJ) return true;
            //check if protected
            return !isProtected(blackKingJ, whiteKingJ, amazonJ);
        }
        //same anti diagonal
        if (blackKingI + blackKingJ == amazonI + amazonJ) {
            if (whiteKingI + whiteKingJ != blackKingI + blackKingJ) return true;
            //check if protected
            return !isProtected(blackKingI, whiteKingI, amazonI);
        }
        return false;
    }

    boolean hasMove(int blackKingI, int blackKingJ, int whiteKingI, int whiteKingJ, int amazonI, int amazonJ) {
        //check whether at least one of the candidate moves is safe
        for (int i = blackKingI-1; i <= blackKingI+1; i++) {
            for (int j = blackKingJ-1; j <= blackKingJ+1; j++) {
                if ((i != blackKingI || j != blackKingJ) && i >= 0 && i < 8 && j >= 0 && j < 8) {
                    if (isTooClose(i, j, whiteKingI, whiteKingJ)) continue;
                    if (isSame(i, j, amazonI, amazonJ)) return true; //can move by taking the amazon
                    if (isCheck(i, j, whiteKingI, whiteKingJ, amazonI, amazonJ)) continue;
                    return true;
                }
            }
        }
        return false;
    }




}
