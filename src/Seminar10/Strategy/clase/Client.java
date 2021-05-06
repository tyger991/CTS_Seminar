package Seminar10.Strategy.clase;

public class Client {
    private IPlata tipPlata;
    private String nume;

    public Client( String nume) {
        super();
        this.nume = nume;
        this.tipPlata = new PlataCash();
    }

    public void setTipPlata(IPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(float suma) {
        System.out.println("Clientul " + this.nume + " are de platit " + suma + " lei");
        tipPlata.plateste(suma);
    }


}
