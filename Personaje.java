import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa a cualquier entidad jugable en el juego.
 * Contiene los atributos y métodos comunes para todos los personajes (como vida, inventario y recibir daño).
 */
public abstract class Personaje {
    private String nombre;
    private int vida;          
    private int energia;       
    private int danioBase;
    
    // Lista que almacena los objetos que el personaje recoge
    private List<Objeto> inventario;

    /**
     * Constructor principal del personaje.
     */
    public Personaje(String nombre, int vida, int energia, int danioBase) {
        this.nombre = nombre;
        // Nos aseguramos de que la vida y energía inicial estén entre 0 y 100 usando Math.min y Math.max
        this.vida    = Math.min(100, Math.max(0, vida));
        this.energia = Math.min(100, Math.max(0, energia));
        this.danioBase = danioBase;
        this.inventario = new ArrayList<>();
    }

    /**
     * Método abstracto: cada tipo de personaje (Mago, Guerrero) definirá su propio ataque especial.
     */
    public abstract void habilidadEspecial();

    // --- MANEJO DE INVENTARIO ---

    public void agregarObjeto(Objeto objeto) {
        inventario.add(objeto);
        System.out.println(nombre + " recogió: " + objeto.getNombre());
    }

    public void usarObjeto(Objeto objeto) {
        // Verifica si el personaje realmente tiene el objeto antes de usarlo
        if (inventario.contains(objeto)) {
            objeto.usar(this);
        } else {
            System.out.println("Objeto no en inventario.");
        }
    }

    // --- MODIFICADORES DE ESTADÍSTICAS ---

    // Aumenta la vida sin pasarse del límite máximo de 100
    public void restaurarVida(int n) { vida = Math.min(100, vida + n); }
    
    // Aumenta el daño base permanentemente
    public void aumentarDanio(int n) { danioBase += n; }
    
    // Resta vida asegurándose de que no baje de 0
    public void recibirDanio(int n)  { vida = Math.max(0, vida - n); }

    // --- GETTERS ---
    public String getNombre()   { return nombre; }
    public int getVida()        { return vida; }
    public int getEnergia()     { return energia; }
    public int getDanioBase()   { return danioBase; }

    @Override
    public String toString() {
        return "[" + nombre + " | Vida:" + vida
             + " | Energía:" + energia + " | Daño:" + danioBase + "]";
    }
}
