package SiralamaAlgoritmalari;

public class HizliSiralama implements ISirala {

    @Override
    public void sirala(int[] dizi) {
     int altIndis = 0;
     int ustIndis = dizi.length - 1;

     quick(dizi,altIndis,ustIndis);
    }

    public void quick(int[] dizi,int altIndis ,int ustIndis) {

        int gecici;
        int i = altIndis;
        int j = ustIndis;


        int bol = altIndis +(ustIndis -altIndis) / 2;
        int pivot=dizi[bol];

        do {
            while (dizi[i] < pivot) {
                i++;
            }
            while (dizi[j] > pivot) {
                j--;
            }
            if (i <= j) {
                gecici = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = gecici;
                i++;
                j--;
            }
        } while (i <= j);

        if (altIndis < j) {
            quick(dizi, altIndis, j);
        }
        if (ustIndis > i) {
            quick(dizi, i, ustIndis);
        }
    }
}
