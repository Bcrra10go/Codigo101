/*
El objetivo de este ejercicio es crear y utilizar una clase para un coche, la clase Coche.java debe de tener los
siguientes métodos y atributos:
    año
    marca
    modelo
    velocidadActual

    [Constructor] Coche: Debe de recibir el año, la marca y el modelo del coche como parámetros. Cuando un coche se crea
    la velocidad se inicializa a 0.

    acelerar: Debe de recibir que tanto quiere acelerar el usuario en km/h e incrementar la velocidad respectivamente.
    La velocidadActual nunca puede ser mayor a 250 km/h.

    frenar: Debe de recibir que tanto quiere reducir la velocidad el usuario en km/h y reducir la velocidad
    respectivamente. La velocidadActual nunca puede ser menor a 0 km/h.

    mostrarInfo: Mostrar el año, marca, modelo y velocidad actual del coche.

Una vez que tengas la clase finalizada, crea dos coches y úsalos en Main.java. Asegúrate de acelerar, frenar y mostrar
la información de ambos coches cada vez que hagas un cambio.

Hint: Checa las funciones de Math.max() y Math.min() NO ES NECESARIO USARLAS PARA COMPLETAR EL EJERCICIO
https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Math.html#max(int,int)
 */

package cursojava.clases.solucion;

public class Main {
    public static void main() {
        Coche golf = new Coche(2016, "Volkswagen", "Golf GTI");
        Coche corolla = new Coche(2025, "Toyota", "Corolla");

        System.out.println("Acelerando coches (120 y 100)");
        golf.acelerar(120);
        corolla.acelerar(100);

        golf.mostrarInfo();
        corolla.mostrarInfo();

        System.out.println("\nFrenando coches (30 y 50)");
        golf.frenar(30);
        corolla.frenar(50);

        golf.mostrarInfo();
        corolla.mostrarInfo();

        System.out.println("\nAcelerando Golf (200), frenando Corolla (100)");
        golf.acelerar(200);
        corolla.frenar(100);

        golf.mostrarInfo();
        corolla.mostrarInfo();
    }
}