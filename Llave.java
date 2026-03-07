public class Llave implements Objeto {
    private String nombre;
    private String zonaAcceso;

    public Llave(String nombre, String zonaAcceso) {
        this.nombre = nombre;
        this.zonaAcceso = zonaAcceso;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void usar(Personaje personaje) {
        System.out.println(nombre + " usada. Acceso: " + zonaAcceso);
    }
}
