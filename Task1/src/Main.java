import computer.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(90, 120);
        arithmeticCalculator.calculate(Operation.ADD);
        arithmeticCalculator.calculate(Operation.SUBTRACT);
        arithmeticCalculator.calculate(Operation.MULTIPLY);




        Processor processor = new Processor(Frecuency.two_point_five, CountCores.TWO, Manufacture.AMD, 20);
        HDD hdd = new HDD(HddType.SSD, 12056, 600);
        KeyBoard keyBoard = new KeyBoard(KeyBoardType.sensor, 100);
        Operative operative = new Operative(OperativeType.DDR3, 200, 2056);
        Screen screen = new Screen(173, ScreenType.IPS, 200);

        Computer computer = new Computer(processor,hdd,keyBoard,screen,operative );

        System.out.println("Общий вес компьютера " + computer.getName() +
                " производства " + computer.getVendor() + " = " + computer.TotalWeight() +
                " грамм ");
        System.out.println(computer);
    }

}