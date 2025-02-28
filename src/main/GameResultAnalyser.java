package main;

public class GameResultAnalyser {
    private final Board board;

    public GameResultAnalyser(Board board) {
        this.board = board;
    }

    public boolean isWin(Symbol symbol) {

        return false;
    }
    private boolean isRowWin(Symbol symbol) {
        for(int row = 0; row < board.sideLength(); row++){
            for(int column = 0; column < board.sideLength(); column++){
                if (symbol[row][column].) {
                }
            }

        }
    }
    private boolean isColumnWin(Symbol symbol) {}
    private boolean isFirstDiagonalWin(Symbol symbol) {}
    private boolean isSecondDiagonalWin(Symbol symbol) {}


    public boolean isDraw(Symbol... symbols) {

        for (Symbol symbol : symbols) {
            if(isWin(symbol)) {
                return false;
            }
        }
        return board.isFull();
    }


}
