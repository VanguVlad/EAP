package Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Catalog.Profesor;
import Catalog.Student;

public class citireCsv {

	private String fileName;
	
	citireCsv(String fileName) {
		this.fileName = fileName;
	}
	
	public List<Student> student() {
		System.out.println("Citire student.csv");
		
		List<Student> studenti = new ArrayList<>();
		
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(this.fileName));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    studenti.add(new Student(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3])));
			    // do something with the data
			}
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studenti;
	}
	
	public List<Profesor> profesor() {
		System.out.println("Citire profesor.csv");
		
		List<Profesor> profesori = new ArrayList<>();
		
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(this.fileName));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    profesori.add(new Profesor(data[0], Integer.parseInt(data[1]), data[2]));
			    // do something with the data
			}
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return profesori;
	}
	
}
