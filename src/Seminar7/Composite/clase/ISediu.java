package Seminar7.Composite.clase;

public interface ISediu {
    public void afiseazaDescriere();
    public void adaugaNod(ISediu sediu) throws Exception;
    public void stergeNod(ISediu sediu) throws Exception;
    public ISediu getNod(int pozitie) throws Exception;
}
