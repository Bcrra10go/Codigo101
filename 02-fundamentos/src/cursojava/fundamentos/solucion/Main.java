/*
El objetivo de este ejercicio es crear 5 variables con las calificaciones de 5 estudiantes, calcular el promedio
del salon y si la calificación promedio es aprobatoria (mayor a 5) o no. Haz el cálculo con los siguientes números y
decide si el salón pasó el examen:

Grupo 1: 8, 4, 9, 3, 7
    La calificación promedio del grupo es: 6.2
    Con este promedio el grupo paso: true
Grupo 2: 6, 3, 4, 5, 4
    La calificación promedio del grupo es: 4.4
    Con este promedio el grupo paso: false
Grupo 3: 5, 6, 3, 7, 8
    La calificación promedio del grupo es: 5.8 (ASEGURATE DE USAR DOUBLES, SI USASTE INTS, EL GRUPO NO PASARÍA)
    Con este promedio el grupo paso: true
Grupo 4: 5, 6, 3, 7, 7.9
    La calificación promedio del grupo es: 5.779999999999999
    Con este promedio el grupo paso: true
Grupo 5: 7.8, 3.9, 9.1, 6.4, 8.5
    La calificación promedio del grupo es: 7.139999999999999
    Con este promedio el grupo paso: true
 */

package cursojava.fundamentos.solucion;

public class Main {
    public static void main(){
        double estudiante0 = 7.8;
        double estudiante1 = 3.9;
        double estudiante2 = 9.1;
        double estudiante3 = 6.4;
        double estudiante4 = 8.5;

        double suma = estudiante0 +
                estudiante1 +
                estudiante2 +
                estudiante3 +
                estudiante4;

        double promedio = suma / 5;

        System.out.println("La calificación promedio del grupo es: " + promedio);

        System.out.println("Con este promedio el grupo paso: " + (promedio > 5));
    }
}
