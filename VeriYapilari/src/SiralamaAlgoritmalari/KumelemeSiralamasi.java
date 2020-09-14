package SiralamaAlgoritmalari;
// Kümeleme/Yığınlama Algoritmasi - Heap Sort
public class KumelemeSiralamasi implements ISirala {
    @Override
    public void sirala(int[] dizi) {
        int n = dizi.length - 1;
        /*kumele(dizi); // O(n) tüm diziyi düzenle
// tüm sort işlemi => O(n log(n))
        */

        for (int i = n; i >=0 ; i--) {
            kumele(dizi,i); // // her heap sorgusu => O (log(n))
        }
    }

    private void kumele(int[] dizi,int i){
        int n = dizi.length - 1;
        int sol = sol(i);
        int sag = sag(i);
        int buyuk = i;

        if((sol <= n) && (dizi[sol] > dizi[buyuk])){
            buyuk = sol;
        }

        if((sag <= n) && (dizi[sag] > dizi[buyuk])){
            buyuk = sag;
        }

        if (buyuk != i){
            int gecici = dizi[i];
            dizi[i] = dizi[buyuk];
            dizi[buyuk] = gecici;
        }

        kumele(dizi,buyuk);

    }

    public int enKucuk(int[] dizi){
        return dizi[dizi.length - 1]; //o(1)
    }

    public int enBuyuk(int[] dizi){
        return dizi[0]; //o(1)
    }

    private int sol(int i){
        return (2 * i) + 1;
    }

    private int sag(int i){
        return (2 * i) + 2;
    }
}
