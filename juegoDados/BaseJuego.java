public class BaseJuego {
    public String nombreJuego;
    public int nivel;

    public BaseJuego(String nombreJuego, int nivel) {
        this.nombreJuego = nombreJuego;
        this.nivel = nivel;
    }

    public void iniciarJuego() {
        System.out.println("Iniciando el juego: " + nombreJuego);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }
}