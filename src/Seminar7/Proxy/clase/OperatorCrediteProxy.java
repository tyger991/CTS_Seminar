package Seminar7.Proxy.clase;

public class OperatorCrediteProxy implements IOperatorCredite {
    public OperatorCredite operator;

    public OperatorCrediteProxy(OperatorCredite operator) {
        this.operator = operator;
    }

    @Override
    public void creareCredite(Moneda moneda, int suma) {
        if (moneda == Moneda.RON) {
            operator.creareCredite(moneda, suma);
        } else {
            System.out.println("Banca la acest moment ofera credite exclusiv in RON");
        }
    }


}
