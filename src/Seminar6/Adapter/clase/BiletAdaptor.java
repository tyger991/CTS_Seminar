package Seminar6.Adapter.clase;

public class BiletAdaptor implements IBiletOnline{
    Bilet bilet;

    public BiletAdaptor(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnline() {
        this.bilet.vanzare();

    }

    @Override
    public void rezervaBiletOnline() {
        this.bilet.rezervare();
    }
}
