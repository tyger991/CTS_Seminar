package Seminar14.teste;

import Seminar14.clase.Grupa;
import Seminar14.clase.IStudent;
import Seminar14.teste.mocks.DummyStudent;
import Seminar14.teste.mocks.FakeStudent;
import Seminar14.teste.mocks.StubStudent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteGrupaMock {
    @Test
    public void testAdaugaStudent(){
        IStudent student = new DummyStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals("Adaugare student",1, grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovabilitate() {
        IStudent student = new StubStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);

        assertEquals(1, grupa.getPromovabilitate(), 0.001);
    }

    @Test
    public void testGetPromovabilitateFakeStudent() {
        Grupa grupa = new Grupa(1081);
        for(int i=0; i<8 ;i++) {
            FakeStudent student = new FakeStudent();
            student.setAreRestante(false);
            grupa.adaugaStudent(student);
        }

        for(int i=0; i<2 ;i++) {
            FakeStudent student = new FakeStudent();
            student.setAreRestante(true);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.8f, grupa.getPromovabilitate(), 0.015);
    }
}
