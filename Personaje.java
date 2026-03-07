import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    private String nombre;
    private int vida;          
    private int energia;       
    private int danioBase;
    private List<Objeto> inventario;

    public Personaje(String nombre, int vida, int energia, int danioBase) {
        this.nombre = nombre;
        this.vida    = Math.min(100, Math.max(0, vida));
        this.energia = Math.min(100, Math.max(0, energia));
        this.danioBase = danioBase;
        this.inventario = new ArrayList<>();
    }

    public abstract void habilidadEspecial();

    public void agregarObjeto(Objeto objeto) {
        inventario.add(objeto);
        System.out.println(nombre + " recogió: " + objeto.getNombre());
    }

    public void usarObjeto(Objeto objeto) {
        if (inventario.contains(objeto)) objeto.usar(this);
        else System.out.println("Objeto no en inventario.");
    }

    public void restaurarVida(int n) { vida = Math.min(100, vida + n); }
    public void aumentarDanio(int n) { danioBase += n; }
    public void recibirDanio(int n)  { vida = Math.max(0, vida - n); }

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

