package Test.SiralamaAlgoritmalari;
import SiralamaAlgoritmalari.*;
import static org.junit.Assert.assertArrayEquals;

public class Test extends ITest {


    @Override
    @org.junit.jupiter.api.Test
    public void algTest() {
        BirlesmeliSiralama siralama = new BirlesmeliSiralama();
        int [] dizi =  {5, 1, 6, 2, 3, 4};
        int[] beklenen ={ 1, 2, 3, 4, 5, 6 };

        siralama.sirala(dizi);
        assertArrayEquals(beklenen,dizi);
    }

    @Override
    @org.junit.jupiter.api.Test
    public void algTest1() {
        ArayaSokma siralama = new ArayaSokma();
        int [] dizi =  {5, 1, 6, 2, 3, 4};
        int[] beklenen ={ 1, 2, 3, 4, 5, 6 };

        siralama.sirala(dizi);
        assertArrayEquals(beklenen,dizi);
    }

    @Override
    @org.junit.jupiter.api.Test
    public void algTest2() {
        KabarcikSiralama siralama = new KabarcikSiralama();
        int [] dizi =  {5, 1, 6, 2, 3, 4};
        int[] beklenen ={ 1, 2, 3, 4, 5, 6 };

        siralama.sirala(dizi);
        assertArrayEquals(beklenen,dizi);
    }

    @Override
    @org.junit.jupiter.api.Test
    public void algTest3() {
        SecmeliSiralama siralama = new SecmeliSiralama();
        int [] dizi =  {5, 1, 6, 2, 3, 4};
        int[] beklenen ={ 1, 2, 3, 4, 5, 6 };

        siralama.sirala(dizi);
        assertArrayEquals(beklenen,dizi);
    }

    @Override
    @org.junit.jupiter.api.Test
    public void algTest4() {
        BuketSiralama siralama = new BuketSiralama();
        int [] dizi =  {5, 1, 6, 2, 3, 4};
        int[] beklenen ={ 1, 2, 3, 4, 5, 6 };

        siralama.sirala(dizi);
        assertArrayEquals(beklenen,dizi);
    }

    @Override
    @org.junit.jupiter.api.Test
    public void algTest5() {
        KumelemeSiralamasi siralama = new KumelemeSiralamasi();
        int [] dizi =  {5, 1, 6, 2, 3, 4};
        int[] beklenen ={ 1, 2, 3, 4, 5, 6 };

        siralama.sirala(dizi);
        assertArrayEquals(beklenen,dizi);
    }

    @Override
    @org.junit.jupiter.api.Test
    public void algTest6() {
        HizliSiralama siralama = new HizliSiralama();
        int [] dizi =  {5, 1, 6, 2, 3, 4};
        int[] beklenen ={ 1, 2, 3, 4, 5, 6 };

        siralama.sirala(dizi);
        assertArrayEquals(beklenen,dizi);

    }
}
