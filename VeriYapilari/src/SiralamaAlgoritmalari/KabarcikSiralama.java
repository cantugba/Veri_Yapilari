package SiralamaAlgoritmalari;
// Kabarcık Sıralama - Bubble Sort
public class KabarcikSiralama implements ISirala
{
    @Override
    public void sirala(int[] dizi) {
        int gecici;
        for (int i = 1; i <dizi.length ; i++) {
            for (int j = 0; j < dizi.length -i; j++) {
                if (dizi[j] > dizi[j+1]){
                    gecici = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = gecici;
                }
            }
        }
    }

}
