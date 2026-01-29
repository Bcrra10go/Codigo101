package cursojava.arrays.contenido;

public class Main {
    public static void main() {
        int[] nums = {1, 2, 3};
        printArray(nums);
        System.out.println();

        nums = new int[3];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;
        printArray(nums);
        System.out.println();

        nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i + 1;
        }
        printArray(nums);

        System.out.println("\nIncrementando números:");
        incrementa(nums);
        printArray(nums);

        int[][] temperaturasSemana = new int[7][4];

        for (int i = 0; i < temperaturasSemana.length; i++) {
            for(int j = 0; j < temperaturasSemana[i].length; j++){
                temperaturasSemana[i][j] = (int) (10 + (20 * Math.random()));
            }
        }

        System.out.println("\nTemperaturas de los dia de la semana:");

        for (int i = 0; i < temperaturasSemana.length; i++) {
            System.out.print("Dia " + (i + 1) + ":" );
            for(int j = 0; j < temperaturasSemana[i].length; j++){
                System.out.print(" " + temperaturasSemana[i][j]);
            }
            System.out.println();
        }

        char[] mensaje = {'H', 'o', 'l', 'a'};

        for (int i = 0; i < mensaje.length; i++) {
            System.out.print(mensaje[i]);
        }
        System.out.println('\n');

        String msg = "Hola";

        System.out.println(msg);
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println();

        String clave = "Diego123";

        acceso("diego123");
        acceso(clave);
    }

    public static void incrementa(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i]++;
        }
    }

    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void acceso(String clave){
        if (clave.contains("123")){
            if (clave.equals("Diego123")){
                System.out.println("Acceso permitido");
                return;
            }
        }
        System.out.println("Acceso restringido");
    }
}