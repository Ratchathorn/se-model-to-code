import java.util.ArrayList;
import java.util.List;

public class MGame {

    private int roundCnt; // round count
    private Die dice1; // first die
    private Die dice2; // second die
    private List<Player> players;
    private Board board;

    public MGame() {
        this.roundCnt = 0;
        this.dice1 = new Die();
        this.dice2 = new Die();
        this.players = new ArrayList<>();
        this.board = new Board();
    }

//    public void addPlayer() {
//
//    }

    public Die getDice1() {
        return dice1;
    }

    public Die getDice2() {
        return dice2;
    }

    public void playGame(int N) {
        for (; roundCnt < N; roundCnt++) {
            playRound();
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
