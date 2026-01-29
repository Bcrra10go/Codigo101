package cursojava.helpers.arrays;

import java.util.Arrays;

public class Clave {
    public static String[] secreto(){
        String[] ret = new String[1000];
        Arrays.fill(ret, "este no es el código");

        int index = (int) (Math.random() * 1000);

        ret[index] = "CLAVE SECRETA: EXPELLIARMUS";

        return ret;
    }
}
