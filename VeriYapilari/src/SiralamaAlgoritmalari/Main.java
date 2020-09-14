package SiralamaAlgoritmalari;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Singleton singleton = Singleton.getNesne();
        System.out.println("Dizi boyutu: ");
        int boyut = sc.nextInt();
        int [] dizi = new int[boyut];
        for (int i = 0; i <dizi.length ; i++) {
            System.out.println((i+1) +". elemanı giriniz ");
            dizi[i]= sc.nextInt();
        }

        //ArayaSokma s = new ArayaSokma();
        //SecmeliSiralama s = new SecmeliSiralama();
        //BuketSiralama s = new BuketSiralama();
        ///KabarcikSiralama s = new KabarcikSiralama();
        //BirlesmeliSiralama s = new BirlesmeliSiralama();
        //KumelemeSiralamasi s = new KumelemeSiralamasi();
        HizliSiralama s = new HizliSiralama();
        s.sirala(dizi);
        Singleton.getNesne().yazdir(dizi);

    }
}
