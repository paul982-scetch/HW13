package computer;

public class KeyBoard {
    private KeyBoardType keyBoardType;
    private double weight;

    public KeyBoard(KeyBoardType keyBoardType, double weight) {
        this.keyBoardType = keyBoardType;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "KeyBoard{" +
                "keyBoardType=" + keyBoardType +
                ", weight=" + weight +
                '}';
    }

    public void setKeyBoardType(KeyBoardType keyBoardType) {
        this.keyBoardType = keyBoardType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public KeyBoardType getKeyBoardType() {
        return keyBoardType;
    }

    public double getWeight() {
        return weight;
    }
}
