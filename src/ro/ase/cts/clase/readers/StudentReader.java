package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class StudentReader extends IReader{
    public StudentReader(String filePath) {
        super(filePath);
    }
    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.filePath));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            super.citireAplicanti(input, student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);

            studenti.add(student);

        }
        input.close();
        return studenti;
    }
}
