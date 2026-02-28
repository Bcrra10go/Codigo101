package cursojava.clases.contenido;

public class Persona {
    int edad;
    String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void presentar() {
        System.out.println("Hola!\n" +
                "Mi nombre es: " + this.nombre +
                " y tengo " + this.edad + " años, mucho gusto!\n");
    }

    public boolean isAdult(){
        return this.edad >= 18;
    }
}
