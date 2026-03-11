/**
 * Interfaz que define el comportamiento básico de cualquier objeto en el juego.
 * Cualquier clase que represente un ítem (arma, poción, etc.) debe implementar esta interfaz.
 */
public interface Objeto {
    // Devuelve el nombre del objeto
    String getNombre();
    
    // Define qué ocurre cuando un personaje utiliza este objeto
    void usar(Personaje personaje);
}
