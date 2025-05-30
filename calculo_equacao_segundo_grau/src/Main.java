import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Entre com o coeficiente a:");
        a = sc.nextDouble();
        System.out.println("Entre com o coeficiente b:");
        b = sc.nextDouble();
        System.out.println("Entre com o coeficiente c:");
        c = sc.nextDouble();

        double[] calculo = calc(a, b, c);

        if (calculo == null){
            System.out.println("A equação não possui raízes reais.");
        } else {
            showResult(calculo[0], calculo[1]);
        }
    }

    public static double[] calc(double x, double y, double z) {
        if (x == 0){
            return null;
        }
        double delta = Math.pow(y, 2) - 4 * x * z;
        if (delta < 0){
            return null;
        }
        double x1 = (-y + Math.sqrt(delta)) / (2 * x);
        double x2 = (-y - Math.sqrt(delta)) / (2 * x);
        return new double[]{x1, x2};
    }

    public static void showResult(double x1, double x2) {
        System.out.println("As raizes da equação são: " + x1 + " e " + x2);
    }
}