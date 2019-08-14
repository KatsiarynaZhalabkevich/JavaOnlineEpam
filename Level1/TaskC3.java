package ezhalabkevich.Level1;
/*сумма квадратов первых 100 чисел*/
/*произведение первых 200 чисел*/
public class TaskC3 {
    public static void main(String[] args) {
        int sum=0;

        for (int i = 1; i <=100 ; i++) {
            sum+=i*i;
        }
        System.out.println("Результат "+sum);

    }
}
