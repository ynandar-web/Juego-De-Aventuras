public class Guerrero extends Personaje {
    private static final int ATAQUE_FISICO = 20;

    public Guerrero(String nombre) {
        super(nombre, 100, 80, 15);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa ATAQUE FÍSICO: "
                         + ATAQUE_FISICO + " pts!");
    }
}