import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        /*Random losowacz = new Random();
        int randomNumber = losowacz.nextInt(501);
        System.out.println(randomNumber);*/

        int[] tab = new int[10000];
        Random losowacz = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(501);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        /******************** SREDNIA *******************/

        int sum = 0;
        for(int liczba : tab) {
            sum = sum + liczba;
        }

        System.out.println("Srednia: " + ((double) sum) / (double) tab.length);
    }
}
