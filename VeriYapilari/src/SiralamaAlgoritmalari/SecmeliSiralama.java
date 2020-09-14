package SiralamaAlgoritmalari;

public class SecmeliSiralama implements ISirala {
    @Override
    public void sirala(int[] dizi) {
        int gecici;
        int enKucukİndis;

        for (int i = 0; i <dizi.length ; i++) {
            enKucukİndis = i;
            //{1,77,7,3,5,9,2,0};
            for (int j = i; j <dizi.length ; j++) {
                if(dizi[j]<dizi[enKucukİndis]){
                    enKucukİndis = j;

                }
            }

            gecici =dizi[i];
            dizi[i]= dizi[enKucukİndis];
            dizi[enKucukİndis] = gecici;

        }
    }

}


