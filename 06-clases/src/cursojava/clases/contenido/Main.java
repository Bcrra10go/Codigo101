package cursojava.clases.contenido;

public class Main {
    public static void main() {
        Persona diego = new Persona(23, "Diego");
        Persona sofia = new Persona(29, "Sofia");
        Persona lalo = new Persona(16, "Eduardo");

        Persona[] personas = {diego, sofia, lalo};

        for (Persona p : personas){
            p.presentar();

            if (p.isAdult()) {
                System.out.println(p.nombre + " es un adulto.\n");
            }
        }
    }
}