import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("введите число: ");
        int a = input.nextInt();

        System.out.println("наименьший делитель числа " + a + ": " + NOD(a));
    }
    public static int NOD(int a) {
        int min = 3;

        if (a % 2 == 0) {
            return 2;
        }

        while (a % min != 0 && min * min <= a) {
            if (min * min <= a) {
                min += 2;
            }
        }
        return min;
    }
}