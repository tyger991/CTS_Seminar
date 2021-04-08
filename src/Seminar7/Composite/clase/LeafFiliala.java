package Seminar7.Composite.clase;

public class LeafFiliala implements ISediu{
    private String numeFiliala;

    public LeafFiliala(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este o filiala " + numeFiliala);

    }

    @Override
    public void adaugaNod(ISediu sediu) throws Exception {
        throw new Exception("Nu este implementat.");

    }

    @Override
    public void stergeNod(ISediu sediu) throws Exception {
        throw new Exception("Nu este implementat.");
    }

    @Override
    public ISediu getNod(int pozitie) throws Exception {
        throw new Exception("Nu este implementat.");
    }
}
