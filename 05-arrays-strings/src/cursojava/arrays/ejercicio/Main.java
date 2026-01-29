/*
Ejercicio 1:
Dentro de la variable de "claves", hay 1,000 strings. Cada vez que se ejecute el programa, una clave secreto será
colocada en algún índice al azar esta clave cuenta con la propiedad de estar comenzar con "CLAVE". El objetivo es
encontrar esta clave iterando a través del arreglo y utilizando los métodos proporcionados por String. Una vez que
encuentres la contraseña imprímela toda en minúsculas.

Ejercicio 2:
Dentro de la variable de "calis", hay 8 estudiantes con 12 calificaciones de diferentes trabajos a través de un
semestre de la forma que calis[2][4] representa la quinta calificación del tercer estudiante (recuerda que comenzamos
a contar desde el 0). El objetivo es conseguir las calificaciones promedio de cada estudiante, las calificaciones
promedio de todos los trabajos y identificar al estudiante con el promedio más alto y el promedio más bajo.

Hint: Puedes crear un array para los promedios. Utiliza round() para redondear los resultados.
 */

package cursojava.arrays.ejercicio;

import cursojava.helpers.arrays.Calificaciones;
import cursojava.helpers.arrays.Clave;

public class Main {
    public static void main() {
        // TODO Ejercicio 1
        String[] claves = Clave.secreto();

        // TODO Ejercicio 2
        double[][] calis = Calificaciones.calis();
    }

    public static double round(double x) {
        return Math.round(x * 10) / 10.0;
    }
}