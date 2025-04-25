package computer;

public class Processor {
    private Frecuency frecuency ;
    private CountCores countCores;
    private Manufacture manufacture;
    private double weight;

    @Override
    public String toString() {
        return "Processor{" +
                "frecuency=" + frecuency +
                ", countCores=" + countCores +
                ", manufacture=" + manufacture +
                ", weight=" + weight +
                '}';
    }

    public Processor(Frecuency frecuency, CountCores countCores, Manufacture manufacture, double weight) {
        this.frecuency = frecuency;
        this.countCores = countCores;
        this.manufacture = manufacture;
        this.weight = weight;
    }

    public void setFrecuency(Frecuency frecuency) {
        this.frecuency = frecuency;
    }

    public void setCountCores(CountCores countCores) {
        this.countCores = countCores;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Frecuency getFrecuency() {
        return frecuency;
    }

    public CountCores getCountCores() {
        return countCores;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public double getWeight() {
        return weight;
    }
}
