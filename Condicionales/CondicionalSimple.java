import java.util.Scanner;

public class CondicionalSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Condición
        if (edad >= 18) {
            System.out.println("Puedes entrar al club");
        }

        scanner.close();
    }
}
