package Seminar7.Facade;

import Seminar7.Facade.clase.Persoana;
import Seminar7.Facade.clase.VerificatorPersoane;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Alex", "1951815256751");
        if(VerificatorPersoane.isEligibil(persoana)){
            System.out.println("Persoana este eligibila.");
        }
        else{
            System.out.println("Persoana nu este eligibila.");

        }
    }

}
