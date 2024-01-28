import java.util.Random;
import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {
        Random nRandom = new Random();
        int numeroRandom = nRandom.nextInt(100);
        int numeroIngresado;
        int intentos;

        System.out.println("Adivina el número");
        System.out.println("Elige un número del 0 al 100");

        for (intentos = 1; ; intentos++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Tu turno: ");
            numeroIngresado = entrada.nextInt();

            if (numeroRandom < numeroIngresado) {
                System.out.println("El número mágico es menor a " + numeroIngresado);
            } else if (numeroRandom > numeroIngresado) {
                System.out.println("El número mágico es mayor a " + numeroIngresado);
            } else {
                System.out.println("¡Felicidades, adivinaste el número mágico en " + intentos + " intentos!");
                break; // Salir del bucle cuando se adivina el número correcto
            }
        }

    }
}
