package Seminar11.Observer.clase;

public class Client implements Observator {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Clientul " + this.nume + " " + mesaj);

    }
}
