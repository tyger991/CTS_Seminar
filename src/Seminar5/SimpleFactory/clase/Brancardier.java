package Seminar5.SimpleFactory.clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return  "\nBrancardierul" + super.getNume();
    }
}
