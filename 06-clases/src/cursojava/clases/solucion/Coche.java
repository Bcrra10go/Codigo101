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

public class Coche {
    int año;
    String marca;
    String modelo;
    int velocidad;

    public Coche(int año, String marca, String modelo) {
        this.año = año;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar(int x) {
        this.velocidad = Math.min(this.velocidad + x, 250);
    }

    public void frenar(int x) {
        this.velocidad = Math.max(this.velocidad - x, 0);
    }

    public void mostrarInfo() {
        System.out.println("Año: " + this.año +
                "\nMarca: " + this.marca  +
                "\nModelo: " + this.modelo +
                "\nVelocidad: " + this.velocidad + "\n");
    }
}
