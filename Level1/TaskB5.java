package ezhalabkevich.Level1;

/*вычислить значение функции*/
public class TaskB5 {
    public static void main(String[] args) {
        int x = -3;
        double result;

        if (x > 3) {
            result = 1 / (Math.pow(x, 3) + 6);
        } else {
            result = x * x - 3 * x + 9;
        }
        System.out.println("Result = " + result);
    }
}
