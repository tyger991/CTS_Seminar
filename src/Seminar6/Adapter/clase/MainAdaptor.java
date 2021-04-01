package Seminar6.Adapter.clase;

public class MainAdaptor {
    private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }
    private static void rezervaSiAfiseazaBiletLaCasa(IBiletOnline bilet){
        bilet.rezervaBiletOnline();
        bilet.vindeBiletOnline();

    }
    public static void main(String[] args) {
        Bilet bilet = new Bilet(30f);
        rezervaSiAfiseazaBiletLaCasa(bilet);

        IBiletOnline adaptor = new BiletAdaptor(bilet);
        rezervaSiAfiseazaBiletLaCasa(adaptor);

        IBiletOnline adaptorClase = new BiletAdapterClase(50);
        rezervaSiAfiseazaBiletLaCasa(adaptorClase);
    }
}
