package Seminar5.SimpleFactory.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nAsistent: " + super.getNume();
    }
}
