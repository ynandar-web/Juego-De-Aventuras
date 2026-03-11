/**
 * Clase que representa a un Guerrero.
 * Hereda de Personaje y se especializa en ataques físicos con alta vida.
 */
public class Guerrero extends Personaje {
    // Daño fijo que causa la habilidad especial
    private static final int ATAQUE_FISICO = 20;

    /**
     * Crea un guerrero con estadísticas predefinidas (100 vida, 80 energía, 15 daño base).
     */
    public Guerrero(String nombre) {
        super(nombre, 100, 80, 15);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa ATAQUE FÍSICO: "
                         + ATAQUE_FISICO + " pts!");
    }
}
