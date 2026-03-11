/**
 * Clase que representa a un Mago.
 * Hereda de Personaje y se especializa en hechizos y alta energía, pero menor vida.
 */
public class Mago extends Personaje {
    // Daño fijo que causa el hechizo
    private static final int PODER_HECHIZO = 30;

    /**
     * Crea un mago con estadísticas predefinidas (70 vida, 100 energía, 10 daño base).
     */
    public Mago(String nombre) {
        super(nombre, 70, 100, 10);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " lanza HECHIZO: "
                         + PODER_HECHIZO + " pts!");
    }
}
