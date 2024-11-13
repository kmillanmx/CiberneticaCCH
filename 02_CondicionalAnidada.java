import java.util.Scanner;

public class CondicionalAnidada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer edad y si tiene licencia
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Tiene licencia? (true/false): ");
        boolean tieneLicencia = scanner.nextBoolean();

        // Condicional anidada
        if (edad >= 18) {
            if (tieneLicencia) {
                System.out.println("Puedes conducir");
            } else {
                System.out.println("No puedes conducir porque no tienes licencia");
            }
        } else {
            System.out.println("No puedes conducir porque no tienes la edad suficiente");
        }

        scanner.close();
    }
}
