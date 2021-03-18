package Seminar4.clase;

public class PresedinteLazy {

    private String nume;
    private int varsta;
    private int mandat;

    private static PresedinteLazy instance = null;

    public PresedinteLazy() {
        this.nume = "Presedinte";
        this.varsta = 45;
        this.mandat = 2;
    }

    public PresedinteLazy(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    public static synchronized PresedinteLazy getInstance(String nume, int varsta, int mandat) {
        if(instance == null) {
            instance = new PresedinteLazy(nume, varsta, mandat);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PresedinteLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }
}

