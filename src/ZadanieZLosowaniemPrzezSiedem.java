import java.util.Random;

public class ZadanieZLosowaniemPrzezSiedem {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random losowacz = new Random();

        for(int i = 0; i < tab.length; i++) {
            tab[i] = 7 * losowacz.nextInt(15);
            System.out.print(tab[i] + " ");
        }
    }
}
