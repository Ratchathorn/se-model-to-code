import java.util.List;

public class Player {

    private String name;
    private Die dice1;
    private Die dice2;
    private Board board;
    private Piece piece;

    public Player(String name, Board board) { // get board from mgame
        this.name = name;
        this.board = board;

    }

    public void takeTurn() {
        dice1.roll(); dice2.roll();
        int fv1 = dice1.getFaceValue();
        int fv2 = dice2.getFaceValue();
        int fvTot = fv1 + fv2;

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }
}
