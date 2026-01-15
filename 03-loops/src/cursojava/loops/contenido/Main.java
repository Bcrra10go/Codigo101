package cursojava.fundamentos.contenido;

public class Main {
    static void main(){
        int x = 5;
        int y = 3;
        int z = x + y;

        double a = 1.1;
        double b = 9.9;

        char u = '$';

        boolean verdadero = true;
        boolean falso = false;


        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        System.out.println();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println();

        System.out.println("b + a = " + (b + a));
        System.out.println("b / a = " + (b / a));

        System.out.println();

        System.out.println("x + a = " + (x + a));

        System.out.println();

        System.out.println(u);

        System.out.println();

        System.out.println("3 = 3? " + (3 == 3));
        System.out.println("3 = 5? " + (3 == 5));
        System.out.println("3 > 3? " + (3 > 3));
        System.out.println("3 >= 3? " + (3 >= 3));
        System.out.println("3 < 5? " + (3 < 5));
        System.out.println("3 != 5? " + (3 != 5));

        System.out.println();

        System.out.println("verdadero: " + verdadero);
        System.out.println("!(no)verdadero: " + !verdadero);
        System.out.println("verdadero &&(y) verdadero: " + (verdadero && verdadero));
        System.out.println("verdadero &&(y) falso: " + (verdadero && falso));
        System.out.println("verdadero ||(o) falso: " + (verdadero || falso));
        System.out.println("falso ||(o) falso: " + (falso || falso));
        System.out.println("verdadero &&(y) !(no)falso" + (verdadero && !falso));

        System.out.println();

        System.out.println(Integer.MAX_VALUE);
        System.out.println((Integer.MAX_VALUE + 1));

        System.out.println(Integer.MIN_VALUE);
        System.out.println((Integer.MIN_VALUE - 1));
    }
}
