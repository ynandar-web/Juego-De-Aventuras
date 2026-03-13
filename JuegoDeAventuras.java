/**
 * Clase principal que ejecuta el programa.
 * Sirve como demostración o prueba de las mecánicas del juego (creación, inventario y combate).
 */
public class JuegoDeAventuras {
    public static void main(String[] args) {

        // 1. Creación de los personajes
        Personaje guerrero = new Guerrero("carlos");
        Personaje mago     = new Mago("juan");
        
        // Muestra el estado inicial de los personajes en la consola
        System.out.println(guerrero);
        System.out.println(mago);

        // 2. Creación de los objetos del mundo
        Objeto espada = new Arma("Espada de acero");
        Objeto pocion = new Pocion("Poción de vida");
        Objeto llave  = new Llave("Llave dorada", "Mazmorra");

        // 3. Simulación de recolección de botín (Loot)
        guerrero.agregarObjeto(espada);
        guerrero.agregarObjeto(pocion);
        guerrero.agregarObjeto(llave);
        
        // 4. Uso de objetos desde el inventario
        guerrero.usarObjeto(espada);  // Sube el daño base del guerrero en 10
        guerrero.usarObjeto(llave);   // Simula la apertura de la Mazmorra

        // 5. Simulación de combate
        guerrero.habilidadEspecial(); // Carlos realiza un Ataque Físico
        mago.habilidadEspecial();     // Juan lanza un Hechizo

        // El guerrero recibe un golpe del enemigo
        guerrero.recibirDanio(40);
        
        // El guerrero se cura utilizando la poción que recogió antes
        guerrero.usarObjeto(pocion); // Restaura 25 puntos de vida

        // 6. Muestra el estado final de los personajes tras la aventura
        System.out.println(guerrero);
        System.out.println(mago);
    }
}
