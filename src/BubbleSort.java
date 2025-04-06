public class BubbleSort {
    public static void main(String[] args) {
        int[] tab = {34,67,5,34,86,75,34,65,8,23,65,47,67,89,68,5,3,46,64,36,75,3,45,6,85,78,45,74};

        boolean exchange = true;
        while(exchange) {
            exchange = false;
            for(int i = 0; i < tab.length - 1; i++) {
                if(tab[i] > tab[i+1]) {
                    int temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = temp;
                    exchange = true;
                }
            }
        }

        for (int element : tab) {
            System.out.print(element + " ");
        }
    }
}
