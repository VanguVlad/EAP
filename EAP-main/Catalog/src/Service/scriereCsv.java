package Service;

import java.io.FileWriter;
import java.io.IOException;

import Catalog.Profesor;
import Catalog.Student;

public class scriereCsv {

	private String fileName;
	
	scriereCsv(String fileName) {
		this.fileName = fileName;
	}
	
	public void profesor(Profesor profesor) {
		System.out.println("Scriere student.csv");
		
		try {
			FileWriter csvWriter = new FileWriter(this.fileName, true);
			csvWriter.append("\n").append(profesor.toCsvString());
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void student(Student student) {
		System.out.println("Scriere student.csv");
		
		try {
			FileWriter csvWriter = new FileWriter(this.fileName, true);
			csvWriter.append("\n").append(student.toCsvString());
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
