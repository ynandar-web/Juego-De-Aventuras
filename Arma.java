/**
 * Representa un arma que el personaje tiene equipado.
 * Las armas incrementan permanentemente el daño base del personaje que la usa.
 */
public class Arma implements Objeto {
    private static final int BONUS_DANIO = 10; // Cantidad de daño extra que otorga
    private String nombre;

    public Arma(String nombre) { this.nombre = nombre; }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void usar(Personaje personaje) {
        // Accede al método del personaje para subir su daño
        personaje.aumentarDanio(BONUS_DANIO);
        System.out.println(nombre + " equipada. Daño +" + BONUS_DANIO);
    }
}
