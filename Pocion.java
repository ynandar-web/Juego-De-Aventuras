public class Pocion implements Objeto {
    private static final int VIDA_RESTAURADA = 25;
    private String nombre;

    public Pocion(String nombre) { this.nombre = nombre; }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void usar(Personaje personaje) {
        personaje.restaurarVida(VIDA_RESTAURADA);
        System.out.println(nombre + " usada. Vida +" + VIDA_RESTAURADA);
    }
}