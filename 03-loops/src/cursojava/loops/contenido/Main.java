package cursojava.loops.contenido;

public class Main {
    public static void main() {
        boolean diaLluvioso = true;
        boolean diaFrio = true;

        if (diaLluvioso) {
            System.out.println("Nos quedamos en casita");
        } else if (diaFrio) {
            System.out.println("Salimos con chamarra");
        } else {
            System.out.println("Vamos al parque!");
        }


        System.out.println("\nWHILE:");
        int x = 0;

        while (x < 10) {
            System.out.println(x);
            x++;
        }

        System.out.println("\nDO WHILE:");
        int y = 100;
        do {
            System.out.println(y);
        } while (y < 10);

        System.out.println("\nFOR");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nFOR CON JUMP STATEMENTS");
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 1) {
                continue;
            }

            if (i == 10) {
                break;
            }
            System.out.println(i);
        }
    }
}