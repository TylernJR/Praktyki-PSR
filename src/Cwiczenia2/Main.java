package Cwiczenia2;

public class Main {
    public static void main(String[] args) {

        //zadanie: posortuj tablice liczb całkowitych rosnąco
        int[] tab = {4, 2, 5, 76, 8, 2, 14, 234, 346, 32, 1};
        int[] wynik = new int[tab.length];

        for (int j = 0; j < wynik.length; j++) {
            //pętla przechodząca po wszystkich elementach tablicy
            int temp = tab[0];
            int lokalizacja = 0;
            for (int i = 1; i < tab.length; i++) {
                if (temp > tab[i]) {
                    temp = tab[i];
                    lokalizacja = i;
                }
                //System.out.println("Temp: "+temp + "Lokalizacja: " +lokalizacja);

            }
            wynik[j] = temp;
            tab[lokalizacja] = Integer.MAX_VALUE;
            System.out.print(wynik[j] + " ,");
        }
    }
}
