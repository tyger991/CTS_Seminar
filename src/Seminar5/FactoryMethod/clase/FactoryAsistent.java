package Seminar5.FactoryMethod.clase;

public class FactoryAsistent implements  IFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
