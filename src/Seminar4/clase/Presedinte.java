package Seminar4.clase;

public class Presedinte {

    private String nume;
    private int varsta;
    private int mandat;

    public Presedinte() {
        this.nume = "Putin";
        this.varsta = 68;
        this.mandat = 10;
    }

    public Presedinte(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    public static Presedinte instance = new Presedinte(); //la eager initialization putem lasa public

    public static Presedinte getInstance(){
        return instance;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getMandat() {
        return mandat;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }

    public static void setInstance(Presedinte instance) {
        Presedinte.instance = instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Presedinte{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }
}
