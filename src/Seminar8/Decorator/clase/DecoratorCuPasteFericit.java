package Seminar8.Decorator.clase;

public class DecoratorCuPasteFericit extends DecoratorAbstract{
    public DecoratorCuPasteFericit(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("FELICITARE: Paste fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("FELICITARE: Paste fericit!");

    }
}
