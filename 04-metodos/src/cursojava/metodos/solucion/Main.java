/*
Ejercicio 1:
Crea los métodos necesarios para una calculadora básica (Sumar, Restar, Multiplicar y Dividir). Calcula el área de un
triángulo con base de (147 - 29) y altura de (97 + 114).

Hint: Área triángulo = ((base x altura) ÷ 2)

Ejercicio 2:
Crea dos métodos, uno que convierta la temperatura de grados centígrados a grados fahrenheit y calcula las siguientes
conversiones:
- 18 °C
- 112 °F
- -21 °C
- -21 °F
- 38 °C
- 39 °F

Hint: °F = (°C x (9/5)) + 32 ||| °C = (°F - 32) x 5/9 ||| Utiliza round(x) para redondear los resultados

Ejercicio 3:
Imprime si los siguientes números son par o impar utilizando métodos.
- 8
- 123
- -15
- 28
- 0

Hint: Recuerda el operador %
 */

package cursojava.metodos.solucion;

public class Main {
    public static void main() {
        // Ejercicio 1
        System.out.println("Área triangulo = " + areaTriangulo(resta(147, 29), suma(97, 114)));
        System.out.println();
        // Ejercicio 2
        System.out.println("18 °C = " + toFahrenheit(18) + " °F");
        System.out.println("112 °F = " + toCelsius(112) + " °C");
        System.out.println("-21 °C = " + toFahrenheit(-21) + " °F");
        System.out.println("-21 °F = " + toCelsius(-21) + " °C");
        System.out.println("38 °C = " + toFahrenheit(38) + " °F");
        System.out.println("39 °F = " + toCelsius(39) + " °C");
        System.out.println();
        // Ejercicio 3
        isPair(8);
        isPair(123);
        isPair(-15);
        isPair(28);
        isPair(0);
    }

    public static double round(double x) {
        return Math.round(x * 10) / 10.0;
    }

    public static int suma(int x, int y){
        return x + y;
    }

    public static int resta(int x, int y){
        return x - y;
    }

    public static int multiplicacion(int x, int y){
        return x * y;
    }

    public static int division(int x, int y){
        return x / y;
    }

    public static int areaTriangulo(int base, int altura){
        return division(multiplicacion(base, altura),2);
    }

    /*
    Por convención, se utiliza la palabra "to" para métodos que transforman una medida/variable
     */
    public static double toFahrenheit(double celsius){
        return round((celsius * (9.0 / 5.0)) + 32);
    }

    /*
    Por convención, se utiliza la palabra "to" para métodos que transforman una medida/variable
     */
    public static double toCelsius(double fahrenheit){
        return round((fahrenheit - 32) * (5.0 / 9.0));
    }

    /*
    Por convención se utiliza la palabra "is" para métodos que evalúan una condición
     */
    public static void isPair(int x){
        if (x % 2 == 0) {
            System.out.println("El número " + x + " es par");
        } else {
            System.out.println("El número " + x + " es impar");
        }
    }
}