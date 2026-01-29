/*
Ejercicio 1:
Dentro de la variable de "claves", hay 1,000 strings. Cada vez que se ejecute el programa, una clave secreto será
colocada en algún índice al azar esta clave cuenta con la propiedad de estar comenzar con "CLAVE". El objetivo es
encontrar esta clave iterando a través del arreglo y utilizando los métodos proporcionados por String. Una vez que
encuentres la contraseña imprímela toda en minúsculas.

Ejercicio 2:
Dentro de la variable de "calis", hay 8 estudiantes con 12 calificaciones de diferentes trabajos a través de un
semestre de la forma que calis[2][4] representa la quinta calificación del tercer estudiante (recuerda que comenzamos
a contar desde el 0). El objetivo es conseguir las calificaciones promedio de la clase, promedio de cada estudiante,
identificar al estudiante con el promedio más alto y el promedio más bajo.

Hint: Puedes crear un array para los promedios. Utiliza round() para redondear los resultados.
 */

package cursojava.arrays.solucion;

import cursojava.helpers.arrays.Calificaciones;
import cursojava.helpers.arrays.Clave;

public class Main {
    public static void main() {
        // Ejercicio 1
        String[] claves = Clave.secreto();

        // Esta es una forma "moderna" de remplazar la for loop tradicional
        for (String s : claves) {
            if (s.contains("CLAVE")){
                System.out.println(s.toLowerCase());
                break;
            }
        }
        System.out.println();

        // Ejercicio 2
        double[][] calis = Calificaciones.calis();
        double[] promedioEstudiantes = promedios(calis);

        double promedioClase = promedioClase(promedioEstudiantes);

        System.out.println("\nPromedio clase: " + promedioClase + "\n");

        int estudianteAlto = promedioAlto(promedioEstudiantes);
        System.out.println("El estudiante " + estudianteAlto + " tiene el promedio más alto con "
                + promedioEstudiantes[estudianteAlto]);

        int estudianteBajo = promedioBajo(promedioEstudiantes);
        System.out.println("El estudiante " + estudianteBajo + " tiene el promedio más bajo con "
                + promedioEstudiantes[estudianteBajo]);
    }

    public static double round(double x) {
        return Math.round(x * 10) / 10.0;
    }

    private static double[] promedios(double[][] calis) {
        double[] promedioEstudiantes = new double[calis.length];
        for(int i = 0; i < calis.length; i++){
            double promedio = 0;
            for (int j = 0; j < calis[i].length; j++) {
                promedio += calis[i][j];
            }
            promedioEstudiantes[i] = round(promedio / calis[i].length);
            System.out.println("Promedio estudiante " + i + ": " + promedioEstudiantes[i]);
        }

        return promedioEstudiantes;
    }

    private static double promedioClase(double[] promedioEstudiantes) {
        double promedioClase = 0;
        for(double d : promedioEstudiantes){
            promedioClase += d;
        }
        promedioClase = round(promedioClase / promedioEstudiantes.length);
        return promedioClase;
    }

    private static int promedioAlto(double[] promedioEstudiantes) {
        int indiceAlto = 0;
        double promedioAlto = promedioEstudiantes[0];

        for (int i = 0; i < promedioEstudiantes.length; i++) {
            double promedio = promedioEstudiantes[i];
            if (promedio > promedioAlto) {
                promedioAlto = promedio;
                indiceAlto = i;
            }
        }

        return indiceAlto;
    }

    private static int promedioBajo(double[] promedioEstudiantes) {
        int indiceBajo = 0;
        double promedioBajo = promedioEstudiantes[0];

        for (int i = 0; i < promedioEstudiantes.length; i++) {
            double promedio = promedioEstudiantes[i];
            if (promedio < promedioBajo) {
                promedioBajo = promedio;
                indiceBajo = i;
            }
        }

        return indiceBajo;
    }
}