import java.util.Random;
import java.util.Stack;

public class movimiento extends JuegoPrincipal{
    private Stack<String> movimientos;
    protected Random dado;

    public movimiento() {
        movimientos = new Stack<>();
        dado = new Random();
    }
    
    public int lanzarDado() {
        return dado.nextInt(6) + 1; // Resultado entre 1 y 6
    }

    public void realizarMovimiento(int resultadoDado, boolean avanzar) {
        if (avanzar) {
            System.out.println("Avanzas " + resultadoDado + " pasos.");
            System.out.println(" ");
        } else {
            int retroceso = (resultadoDado % 2 == 0) ? resultadoDado / 2 : resultadoDado;
            System.out.println("Tu rival retrocede " + retroceso + " pasos.");
            System.out.println(" ");
        }
    }

    public void agregarMovimiento(String movimiento) {
        movimientos.push(movimiento);
    }

    public String deshacerMovimiento() {
        return movimientos.isEmpty() ? "No hay movimientos para deshacer" : movimientos.pop();
    }
}