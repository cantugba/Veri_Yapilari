package SiralamaAlgoritmalari;

public class Singleton {
    private static Singleton yazdirNesne;

    private Singleton(){

    }

    public static Singleton getNesne(){
        if(yazdirNesne == null){
            yazdirNesne = new Singleton();
        }

        return yazdirNesne;
    }
    public void yazdir(int[] dizi) {
        for (int i = 0; i <dizi.length ; i++){
            System.out.println((i+1)+".eleman:"+dizi[i]);
        }
    }
}
