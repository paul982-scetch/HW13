public class ArithmeticCalculator {
    public int x;
    public int y;

    public ArithmeticCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculate (Operation operation ){
        if (operation == Operation.ADD){
            System.out.println(x + y);
        }else if (operation == Operation.SUBTRACT){
            System.out.println(x - y);
        }else if (operation == Operation.MULTIPLY){
            System.out.println(x * y);
        }else {
            System.out.println("Неверный ввод, попробйте ещё раз");
        }
    }
}
