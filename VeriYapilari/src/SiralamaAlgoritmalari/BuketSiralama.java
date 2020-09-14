package SiralamaAlgoritmalari;
//Buket Sıralama - Radix Sort

public class BuketSiralama implements ISirala{
    @Override
    public void sirala(int[] dizi) {
        int m = dizi[0];
         int exp = 1; //basamak
        int [] b = new int[10]; //sirali değer rakamlar( 0-9)

        for (int j = 0; j <dizi.length ; j++) {
            if (dizi[j]>m){
                m = dizi[j];
            }

            while (m / exp > 0){
                int [] buket = new int[10];

                for (int k = 0; k <dizi.length; k++) {
                    buket[(dizi[k] / exp) % 10]++;
                }

                for (int k = 1; k <10 ; k++) {
                    buket[k] += buket[k-1];
                }

                for (int k = dizi.length - 1; k>= 0; k--){
                    b[--buket[(dizi[k] / exp) % 10]] = dizi[k];
                }

                for (int k = 0; k <dizi.length ; k++) {
                    dizi[k] = b[k];
                }
                exp *=10;
            }
        }

    }

}


