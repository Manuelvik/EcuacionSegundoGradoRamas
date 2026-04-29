package ecuacionsegundogradoramas; // NetBeans agrega esto automáticamente

import java.util.Scanner;

public class EcuacionSegundoGradoRamas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x1, x2;

        System.out.println("--- Versión 1: Base (con error) ---");
        System.out.print("Ingrese a: ");
        a = sc.nextInt();
        System.out.print("Ingrese b: ");
        b = sc.nextInt();
        System.out.print("Ingrese c: ");
        c = sc.nextInt();

        // Fórmula con el error (+b)
        x1 = (b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        x2 = (b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        System.out.println("Raiz 1: " + x1);
        System.out.println("Raiz 2: " + x2);
    }
}