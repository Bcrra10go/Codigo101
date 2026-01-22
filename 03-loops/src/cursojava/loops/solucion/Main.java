/*
Ejercicio 1:
Usando loops e ifs, imprime los números del 0 al 100. Si número es múltiplo de 3 imprime la palabra "Fizz", si es
múltiplo de 5, imprime "Buzz" y si es múltiplo de 3 y 5 imprime "FizzBuzz"

Ejercicio 2:
Usando solamente loops e ifs, imprime la siguiente figura:
*          (1 estrella)
***        (3 estrellas)
*****      (5 estrellas)
*******    (7 estrellas)
*********  (9 estrellas)

Hint: Recuerda que 'println' imprime una expresión por línea mientras que 'print' imprime en la misma línea hasta
encontrar '\n'
 */

package cursojava.loops.solucion;

public class Main {
    public static void main() {
        // Ejercicio 1
        System.out.println("Ejercicio 1:");
        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Ejercicio 2
        System.out.println("\nEjercicio 2:");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) continue;
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}