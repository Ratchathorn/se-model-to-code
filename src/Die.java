import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
        this.faceValue = 1;
        roll();
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = new Random().nextInt(6)+1;
    }
}
