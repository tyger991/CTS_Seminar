package Seminar11.Memento.clase;

public class Meci  {
    private String echipaGazda;
    private String echipaOaspeti;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;
    private int nrStewarzi;

    public Meci(String echipaGazda, String echipaOaspeti, int nrBileteVandute, int nrSpectatori, int nrJandarmi, int nrStewarzi) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspeti = echipaOaspeti;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public String getEchipaOaspeti() {
        return echipaOaspeti;
    }

    public int getNrBileteVandute() {
        return nrBileteVandute;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public int getNrJandarmi() {
        return nrJandarmi;
    }

    public int getNrStewarzi() {
        return nrStewarzi;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspeti(String echipaOaspeti) {
        this.echipaOaspeti = echipaOaspeti;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStewarzi(int nrStewarzi) {
        this.nrStewarzi = nrStewarzi;
    }

    public Memento creazaMemento() {
        Memento memento = new Memento(this.nrSpectatori, this.echipaGazda, this.echipaOaspeti);
        return memento;
    }

    public void seteazaMemento(Memento memento){
        this.echipaGazda = memento.getNumeEchipaGazda();
        this.echipaOaspeti = memento.getNumeEchipaOaspete();
        this.nrSpectatori = memento.getNrSpectatori();
    }
}
