package Seminar4.clase;

public class Cinema {
    private String denumire;
    private int sali;
    private double incasari;

    private static Cinema instance = null;

    private Cinema() {
        this.denumire = "Cinema City";
        this.sali = 6;
        this.incasari = 2300.5;
    }

    private Cinema(String denumire, int sali, double incasari) {
        this.denumire = denumire;
        this.sali = sali;
        this.incasari = incasari;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getSali() {
        return sali;
    }

    public void setSali(int sali) {
        this.sali = sali;
    }

    public double getIncasari() {
        return incasari;
    }

    public void setIncasari(double incasari) {
        this.incasari = incasari;
    }

    public static synchronized Cinema getInstance(String denumire, int sali, double incasari){
        if(instance == null) {
            instance = new Cinema(denumire, sali, incasari);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cinema{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", sali=").append(sali);
        sb.append(", incasari=").append(incasari);
        sb.append('}');
        return sb.toString();
    }
}
