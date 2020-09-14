package SiralamaAlgoritmalari;
// Araya Sokma Siralamasi - Insertion Sort
public class ArayaSokma implements ISirala{

    @Override
    public void sirala(int[] dizi) {

        for (int i = 0; i <dizi.length; i++) {

            int sayi = dizi[i];
            int j= i-1;
            while (j>=0 && (dizi[j]>sayi)){
                dizi[j+1] = dizi[j];
                j--;
            }
            dizi[j + 1] = sayi;
        }
    }


}



