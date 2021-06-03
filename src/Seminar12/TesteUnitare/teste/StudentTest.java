/*package Seminar12.TesteUnitare.teste;

import Seminar12.TesteUnitare.clase.Student;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {



    @Test
    public void testConstructorCuParametru() {
        String nume = "Costica";
        Student student = new Student(nume);

        assertEquals(nume, student.getNume());
        assertNotNull(student.getNote());
    }

    private void assertEquals(int nume, int nume1) {
    }

    private void assertNotNull(List<Integer> note) {
    }


    @Test
    public void testConstructorFaraParametrii(){
        Student student = new Student();

        assertNotNull(student.getNote());
        assertNotNull(student.getNote());

    }

    @Test
    public void testAdaugaNota() {
        Student student = new Student();

        int nota = 5;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));

    }

    @Test
    public void testAdaugaNotaDimensiune() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);

        assertEquals(2, student.getNote().size());
    }

    @org.junit.Test
    public void testCalculeazaMedieNote() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);

        assertEquals(6.5f, student.calculeazaMedie(), 0.1);

    }


    @org.junit.Test
    public void testCalculeazaMedieFaraNote(){
        Student student = new Student();

        assertEquals(0, student.calculeazaMedie(), 0.1);
    }

    @org.junit.Test
    public void testCalculeazaMedieCuNota(){
        Student student = new Student();
        student.adaugaNota(5);

        assertEquals(5, student.calculeazaMedie(), 0.1);

    }

    @org.junit.Test
    public void testAreRestante() {
        Student student = new Student();
        student.adaugaNota(9);
        student.adaugaNota(3);
        assertTrue(student.areRestante());
    }

    @org.junit.Test
    public void testNuAreRestante() {
        Student student = new Student();
        student.adaugaNota(9);
        student.adaugaNota(8);
        assertTrue(student.areRestante());

    }


}
*/
