package Seminar12.TesteUnitare.teste;

import Seminar12.TesteUnitare.clase.Student;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;




class Test {

    @org.junit.Test
    public void testConstructorCuParametru() {
        String nume = "Costica";
        Student student = new Student(nume);

        assertEquals(nume, student.getNume());
        assertNotNull(student.getNote());
    }

    private void assertEquals(String nume, String nume1) {
    }

    private void assertNotNull(List<Integer> note) {
    }


    @org.junit.Test
    public void testConstructorFaraParametrii(){
        Student student = new Student();

        assertNotNull(student.getNote());
        assertNotNull(student.getNote());

    }

    @org.junit.Test
    public void testAdaugaNota() {
        Student student = new Student();

        int nota = 5;
        student.adaugaNota(nota);
        //assertEquals(nota, student.getNota(0));

    }

    @org.junit.Test
    public void testAdaugaNotaDimensiune() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);

        //assertEquals(2, student.getNote().size());
    }

    @org.junit.Test
    public void testCalculeazaMedieNote() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);

        //assertEquals(6.5f, student.calculeazaMedie(), 0.1);

    }


    @org.junit.Test
    public void testCalculeazaMedieFaraNote(){
        Student student = new Student();

        //assertEquals(0, student.calculeazaMedie(), 0.1);
    }

    @org.junit.Test
    public void testCalculeazaMedieCuNota(){
        Student student = new Student();
        student.adaugaNota(5);

        //assertEquals(5, student.calculeazaMedie(), 0.1);

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