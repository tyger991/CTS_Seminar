package ro.ase.cts.program;

import ro.ase.cts.clase.*;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static List<Aplicant> citesteAplicanti( IReader readAplicants) throws FileNotFoundException{
		return readAplicants.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pentru angajati: " + Angajat.getSumaFinantare());
		System.out.println("Suma finantata pentru elevi: " + Elev.getSumaFinantare());
		System.out.println("Suma finantata pentru student: " + Student.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect = new Proiect(81);
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
				aplicant.afisareRaspunsProiect(proiect);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
