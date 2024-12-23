import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class JuegoPrincipal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion = menu.mostrarMenu();

        if (opcion == 1) {
            dosJugadores modoDos = new dosJugadores("Carrera de Dados", 1);
            modoDos.configurarJugadores();
            modoDos.iniciarJuego();
            modoDos.iniciarModoDosJugadores();

            circuito pistaCarrera = new circuito("Hecho por Ramiro", 1);
            pistaCarrera.mostrarDetalles();

            movimiento mov = new movimiento();
            int distancia = pistaCarrera.getDistancia();
            int[] retrocesos = pistaCarrera.getRetrocesos();
            int posicionJugador1 = 0;
            int posicionJugador2 = 0;

            // Usamos Queue para manejar los turnos de los jugadores
            Queue<String> turnos = new LinkedList<>();
            turnos.add(modoDos.getJugador1());
            turnos.add(modoDos.getJugador2());

            // Usamos ArrayList para almacenar los movimientos de los jugadores
            ArrayList<String> movimientosRealizados = new ArrayList<>();

            while (posicionJugador1 < distancia && posicionJugador2 < distancia) {
                String jugadorActual = turnos.poll();  // Obtiene el jugador actual (FIFO)
                turnos.add(jugadorActual);  // Agrega el jugador de vuelta a la cola para el siguiente turno

                System.out.println("(+)Turno de " + jugadorActual + "(-):");
                int resultadoDado = mov.lanzarDado();
                System.out.println("Resultado del dado: " + resultadoDado);

                Scanner sc = new Scanner(System.in);
                System.out.print("Elige 1 para avanzar o 2 para retroceder a tu rival: ");
                int eleccion = sc.nextInt();

                if (jugadorActual.equals(modoDos.getJugador1())) {
                    if (eleccion == 1) {
                        posicionJugador1 += resultadoDado;
                        movimientosRealizados.add(modoDos.getJugador1() + " avanza a la posición: " + posicionJugador1);
                    } else {
                        int retroceso = (resultadoDado % 2 == 0) ? resultadoDado / 2 : resultadoDado;
                        posicionJugador2 -= retroceso;
                        if (posicionJugador2 < 0) posicionJugador2 = 0;
                        movimientosRealizados.add(modoDos.getJugador2() + " retrocede a la posición: " + posicionJugador2);
                    }

                    for (int retroceso : retrocesos) {
                        if (posicionJugador1 == retroceso) {
                            posicionJugador1 -= 10;
                            movimientosRealizados.add(modoDos.getJugador1() + " retrocede 10 pasos por un obstáculo.");
                        }
                    }

                    if (posicionJugador1 >= distancia) {
                        System.out.println("¡" + modoDos.getJugador1() + " gana la carrera!");
                        break;
                    }
                } else {
                    if (eleccion == 1) {
                        posicionJugador2 += resultadoDado;
                        movimientosRealizados.add(modoDos.getJugador2() + " avanza a la posición: " + posicionJugador2);
                    } else {
                        int retroceso = (resultadoDado % 2 == 0) ? resultadoDado / 2 : resultadoDado;
                        posicionJugador1 -= retroceso;
                        if (posicionJugador1 < 0) posicionJugador1 = 0;
                        movimientosRealizados.add(modoDos.getJugador1() + " retrocede a la posición: " + posicionJugador1);
                    }

                    for (int retroceso : retrocesos) {
                        if (posicionJugador2 == retroceso) {
                            posicionJugador2 -= 10;
                            movimientosRealizados.add(modoDos.getJugador2() + " retrocede 10 pasos por un obstáculo.");
                        }
                    }

                    if (posicionJugador2 >= distancia) {
                        System.out.println("¡" + modoDos.getJugador2() + " gana la carrera!");
                        break;
                    }
                }
            }

            // Mostrar todos los movimientos realizados
            System.out.println("\nMovimientos realizados durante el juego:");
            for (String movimiento : movimientosRealizados) {
                System.out.println(movimiento);
            }
        } else {
            System.out.println("Juego terminado, gracias por jugar y regalen un aprobado");
        }
    }
}