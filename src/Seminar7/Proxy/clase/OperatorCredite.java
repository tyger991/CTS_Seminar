package Seminar7.Proxy.clase;

public class OperatorCredite implements IOperatorCredite {
    @Override
    public void creareCredite(Moneda moneda, int suma) {
        System.out.println("A fost oferit creditul in suma de " + suma + " " + moneda);
    }
}
