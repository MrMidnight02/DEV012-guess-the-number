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

        for (intentos = 1; ; intentos ++) {
            // Turno del jugador
            Scanner entrada = new Scanner(System.in);
            System.out.println("Tu turno: ");
            numeroIngresado = entrada.nextInt();

            if (numeroRandom < numeroIngresado) {
                System.out.println("El número mágico es menor a " + numeroIngresado);
            } else if (numeroRandom > numeroIngresado) {
                System.out.println("El número mágico es mayor a " + numeroIngresado);
            } else {
                System.out.println("¡Felicidades, adivinaste el número mágico en " + intentos + " intentos!");
                return; // Terminar el programa cuando se adivina el número correcto
            }

            // Turno de la computadora
            int intentoComputadora = nRandom.nextInt(100);
            System.out.println("Turno de la computadora: La computadora elige " + intentoComputadora);

            if (numeroRandom < intentoComputadora) {
                System.out.println("El número mágico es menor a " + intentoComputadora);
            } else if (numeroRandom > intentoComputadora) {
                System.out.println("El número mágico es mayor a " + intentoComputadora);
            } else {
                System.out.println("¡La computadora adivinó el número mágico en " + (intentos + 1) + " intentos!");
                return; // Terminar el programa cuando la computadora adivina el número correcto
            }
        }
    }
}
