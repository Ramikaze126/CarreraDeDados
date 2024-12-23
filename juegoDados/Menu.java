import java.util.Scanner;

public class Menu {
    public int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Iniciar juego");
        System.out.println("2. Terminar juego");
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }
}