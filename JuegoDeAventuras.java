public class JuegoDeAventuras {
    public static void main(String[] args) {

        Personaje guerrero = new Guerrero("carlos");
        Personaje mago     = new Mago("juan");
        System.out.println(guerrero);
        System.out.println(mago);

        Objeto espada = new Arma("Espada de acero");
        Objeto pocion = new Pocion("Poción de vida");
        Objeto llave  = new Llave("Llave dorada", "Mazmorra");

        guerrero.agregarObjeto(espada);
        guerrero.agregarObjeto(pocion);
        guerrero.agregarObjeto(llave);
        guerrero.usarObjeto(espada);  // +10 daño
        guerrero.usarObjeto(llave);   // abre zona

        guerrero.habilidadEspecial(); // Ataque físico
        mago.habilidadEspecial();     // Hechizo

        guerrero.recibirDanio(40);
        guerrero.usarObjeto(pocion); // restaura 25 pts

        System.out.println(guerrero);
        System.out.println(mago);
    }

}
