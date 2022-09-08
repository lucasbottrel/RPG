package Java;
import java.util.*;

public class Global {
    public static Scanner scanner = new Scanner(System.in);
    public static String jogador1 = "VINI";
    public static String jogador2 = "BOTTREL";
    public static String jogador3 = "TIO MARQUIN";

    public static int random(int min, int max) // range : [min, max]
    {
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }
}
