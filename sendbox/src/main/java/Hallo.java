public class Hallo {
    public static void main(String[] args){
        try {
            int z = calculate();
            System.out.println(z);
            System.out.println("Hallo, world!!!");
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
    }

    private static int calculate() {
        var x = 1;
        var y = 0;
        var z = divide(x, y);
        return z;
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
