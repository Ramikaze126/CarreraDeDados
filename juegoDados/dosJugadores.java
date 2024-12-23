import java.util.Scanner;

public class dosJugadores extends BaseJuego {
    private String jugador1;
    private String jugador2;

    public dosJugadores(String nombreJuego, int nivel) {
        super(nombreJuego, nivel);
    }

    public void configurarJugadores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del jugador 1: ");
        this.jugador1 = sc.nextLine();
        System.out.print("Introduce el nombre del jugador 2: ");
        this.jugador2 = sc.nextLine();
    }

    @Override
    public void iniciarJuego() {
        super.iniciarJuego();
        System.out.println("Jugadores configurados: " + jugador1 + " vs " + jugador2);
    }

    public void iniciarModoDosJugadores() {
        System.out.println("Jugadores: " + jugador1 + " vs " + jugador2);
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }
}