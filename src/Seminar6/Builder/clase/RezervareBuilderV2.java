package Seminar6.Builder.clase;

public class RezervareBuilderV2 implements AbstractBuilder {

    private int codRezervare;
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public RezervareBuilderV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public RezervareBuilderV2 setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
        return this;
    }

    public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public RezervareBuilderV2() {
        this.codRezervare = 100;
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.genMuzica = "populara";

    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare, areMancare, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
    }
}
