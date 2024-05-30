import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        int x1, x2, x3, y1, y2, y3;
        double per;

        Scanner in = new Scanner(System.in);

        System.out.println("введите координаты первой точки: ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.println("введите координаты второй точки: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.println("введите координаты третьей точки: ");
        x3 = in.nextInt();
        y3 = in.nextInt();

        per = len(x1, y1, x2 ,y2) + len(x1, y1, x3, y3) + len(x2, y2, x3, y3);

        System.out.println("длина первой стороны равна: " + len(x1, y1, x2 ,y2));
        System.out.println("длина второй стороны равна: " + len(x1, y1, x3, y3));
        System.out.println("длина третьей стороны равна: " + len(x2, y2, x3, y3));
        System.out.println("периметр треугольника равен: " + per);
    }

    public static double len(int x, int y, int xk, int yk) {
        return(Math.sqrt(Math.pow( x - xk, 2) + Math.pow( y - yk, 2)));
    }
}
