package computer;

import java.lang.reflect.Type;

public class HDD {
    private  HddType hddType;
    private double volume;
    private double weight;

    @Override
    public String toString() {
        return "HDD{" +
                "hddType=" + hddType +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }

    public void setHddType(HddType hddType) {
        this.hddType = hddType;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public HddType getHddType() {
        return hddType;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public HDD(HddType hddType, double volume, double weight) {
        this.hddType = hddType;
        this.volume = volume;
        this.weight = weight;
    }
}
