public class Mago extends Personaje {
    private static final int PODER_HECHIZO = 30;

    public Mago(String nombre) {
        super(nombre, 70, 100, 10);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " lanza HECHIZO: "
                         + PODER_HECHIZO + " pts!");
    }
}
