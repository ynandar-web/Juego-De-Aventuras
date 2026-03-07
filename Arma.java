public class Arma implements Objeto {
    private static final int BONUS_DANIO = 10; // DR
    private String nombre;

    public Arma(String nombre) { this.nombre = nombre; }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void usar(Personaje personaje) {
        personaje.aumentarDanio(BONUS_DANIO);
        System.out.println(nombre + " equipada. Daño +" + BONUS_DANIO);
    }
}