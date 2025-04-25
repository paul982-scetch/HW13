package computer;

public class Operative {
    private OperativeType operativeType;
    private double weight;
    private double volume;

    @Override
    public String toString() {
        return "Operative{" +
                "operativeType=" + operativeType +
                ", weight=" + weight +
                ", volume=" + volume +
                '}';
    }

    public void setOperativeType(OperativeType operativeType) {
        this.operativeType = operativeType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public OperativeType getOperativeType() {
        return operativeType;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public Operative(OperativeType operativeType, double weight, double volume) {
        this.operativeType = operativeType;
        this.weight = weight;
        this.volume = volume;
    }
}
