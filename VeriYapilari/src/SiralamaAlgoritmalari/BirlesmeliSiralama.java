package SiralamaAlgoritmalari;
// Birleşmeli Sıralama - Merge Sort
public class BirlesmeliSiralama implements ISirala {
    @Override
    public void sirala(int[] dizi) {
        int boyut = dizi.length;
        if (boyut < 2){
            return;
        }

        int orta = boyut / 2; //diziyi ikiye böl
        int [] sol = new int[orta];
        int [] sag = new int[boyut - orta];

        for (int i = 0; i <orta ; i++) {
            sol[i] = dizi[i];
        }

        for (int i = orta; i < boyut ; i++) {
            sag[i - orta] = dizi[i];
        }

        sirala(sol);
        sirala(sag);

        birlestir(dizi,sol,sag,orta,boyut - orta);
    }

    public void  birlestir(int[] dizi,int[] sol,int[]sag,int l,int r){
        int i = 0, j = 0, k = 0; //sol sag sayac

        while (i < l && j < r){
            if(sol[i]<=sag[j]){
                dizi[k++] = sol[i++];
            }
            else{
                dizi[k++] = sag[j++];
            }
        }

        while(i < l){
            dizi[k++] = sol[i++];
        }
        while(j < r){
            dizi[k++] = sag[j++];
        }
    }
}

