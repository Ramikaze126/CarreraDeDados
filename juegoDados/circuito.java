import java.util.Random;
import java.util.Scanner;

public class circuito {
    public String nombreCircuito;
    public int distancia;
    public int[] retrocesos;

    public circuito(String nombreCircuito, int numRetrocesos) {
        this.nombreCircuito = nombreCircuito;
        configurarDistancia();
        generarRetrocesos(numRetrocesos);
    }

    private void configurarDistancia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1, escribe la distancia del circuito: ");
        int distanciaJugador1 = sc.nextInt();
        System.out.print("Jugador 2, escribe la distancia del circuito: ");
        int distanciaJugador2 = sc.nextInt();

        Random random = new Random();
        this.distancia = random.nextBoolean() ? distanciaJugador1 : distanciaJugador2;
        System.out.println("La distancia elegida para el circuito es: " + distancia);
    }

    private void generarRetrocesos(int numRetrocesos) {
        Random random = new Random();
        retrocesos = new int[numRetrocesos];
        for (int i = 0; i < numRetrocesos; i++) {
            retrocesos[i] = random.nextInt(distancia / 2) + 1;
        }
    }

    public void mostrarDetalles() {
        System.out.println("Circuito: " + nombreCircuito);
        System.out.println("Distancia: " + distancia);
        System.out.print("Retrocesos en las posiciones: ");
        for (int r : retrocesos) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    public int getDistancia() {
        return distancia;
    }

    public int[] getRetrocesos() {
        return retrocesos;
    }
}