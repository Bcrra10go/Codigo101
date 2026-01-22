package cursojava.metodos.contenido;

public class Main {
    public static void main() {
        saludo();
        nombre("Diego");
        despedida();

        lineaNueva();

        conversacion("Santiago");

        lineaNueva();

        System.out.println(suma(3, 4));
        System.out.println(suma(suma(1,2), suma(5, -1)));

        lineaNueva();

        int x = 1;
        int y = 2;

        cambio(x, y);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void saludo() {
        System.out.println("Hola, bienvenido!");
    }

    public static void nombre(String nombre) {
        System.out.println("Mucho gusto " + nombre);
    }

    public static void despedida() {
        System.out.println("Espero tengas un excelente día, hasta luego!");
    }

    public static void lineaNueva(){
        System.out.println();
    }

    public static void conversacion(String nombre) {
        saludo();
        nombre(nombre);
        despedida();
    }

    public static int suma(int x, int y){
        return x + y;
    }

    public static void cambio(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
}