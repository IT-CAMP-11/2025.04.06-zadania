public class Zadanie2 {
    public static void main(String[] args) {
        int[] tab = new int[1000];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
            if(tab[i] % 2 == 0 && tab[i] % 3 == 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
