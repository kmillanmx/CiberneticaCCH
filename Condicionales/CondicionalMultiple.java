import java.util.Scanner;

public class CondicionalMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el puntaje
        System.out.print("Ingrese el puntaje: ");
        int puntaje = scanner.nextInt();

        // Condicionales múltiples
        if (puntaje >= 90) {
            System.out.println("A");
        } else if (puntaje >= 80) {
            System.out.println("B");
        } else if (puntaje >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}
