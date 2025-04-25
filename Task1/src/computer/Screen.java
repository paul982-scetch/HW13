package computer;

public class Screen {
    private double diagonal;
    private ScreenType screenType;
    private double weight;

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "diagonal=" + diagonal +
                ", screenType=" + screenType +
                ", weight=" + weight +
                '}';
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public double getWeight() {
        return weight;
    }

    public Screen(double diagonal, ScreenType screenType, double weight) {
        this.diagonal = diagonal;
        this.screenType = screenType;
        this.weight = weight;
    }
}
