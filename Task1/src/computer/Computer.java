package computer;

public class Computer {

    private final String vendor = "Космос";
    private final String name  = "Латвия";
    private Processor processor;
    private HDD hdd;
    private KeyBoard keyBoard;
    private Screen screen;
    private Operative operative;

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public HDD getHdd() {
        return hdd;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public Screen getScreen() {
        return screen;
    }



    public Operative getOperative() {
        return operative;
    }

    public Computer(Processor processor, HDD hdd, KeyBoard keyBoard, Screen screen,  Operative operative) {
        this.processor = processor;
        this.hdd = hdd;
        this.keyBoard = keyBoard;
        this.screen = screen;

        this.operative = operative;
    }



    public double TotalWeight(){

                return processor.getWeight() + hdd.getWeight() + keyBoard.getWeight() +
                screen.getWeight() + operative.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                ", processor=" + processor +
                ", hdd=" + hdd +
                ", keyBoard=" + keyBoard +
                ", screen=" + screen +

                ", operative=" + operative +
                '}';
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }



    public void setOperative(Operative operative) {
        this.operative = operative;
    }
}
