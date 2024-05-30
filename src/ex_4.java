import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        int a;

        Scanner in = new Scanner(System.in);

        System.out.println("введите число: ");
        a = in.nextInt();

        System.out.println("факториал числа " + a + ": " + fac(a));
    }
    private static int fac(int k) {
        if(k <= 1){
            return 1;
        }else {
            return k * fac(k - 1);
        }
    }
}