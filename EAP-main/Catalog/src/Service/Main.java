package Service;

import Catalog.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        //Instantiere si afisare  Decan

        new Decan();
        Decan.AfisareDecan();


        // Initializari si afisari studenti si profesori
        //citeste profesori din CSV
        citireCsv csvProfesorIn = new citireCsv("profesor.csv");
        List<Profesor> profesori = csvProfesorIn.profesor();
        
        //scrie un profesor nou in CSV
        scriereCsv csvProfesorOut = new scriereCsv("profesor.csv");
        Profesor prof = new Profesor("El Profesor", 38, "Money Heist");
        csvProfesorOut.profesor(prof);
        
        /*Profesor[] profi = new Profesor[4];
        profi[0] = new Profesor("Dragan Andrei", 55, "Poo");
        profi[1] = new Profesor("Banu Laur", 60, "Poo");
        profi[2] = new Profesor("Simion Mariana", 28, "Marketing");
        profi[3] = new Profesor("Gratu Andra Maria", 30, "Marketing");*/
        
        
        System.out.println("Lista Profesorilor:");
        for (int i = 0; i < profesori.size(); i++) {
            profesori.get(i).Afisare();
            System.out.println();
        }

        //citeste studenti din CSV
        citireCsv csvStudentIn = new citireCsv("student.csv");
        List<Student> studenti = csvStudentIn.student();
        
        //scrie un student nou in CSV
        scriereCsv csvStudentOut = new scriereCsv("student.csv");
        Student stud = new Student("Mihai Bogdan", 51, 1, 123);
        csvStudentOut.student(stud);
        
        /*Student[] studenti = new Student[15];
        studenti[0] = new Student("Manea Bogdan ", 20, 1, 124);
        studenti[1] = new Student("Apostol Filip", 23, 4, 435);
        studenti[2] = new Student("Popica Adrian", 22, 3, 354);
        studenti[3] = new Student("Marcula Stefan", 20, 2,255 );
        studenti[4] = new Student("Emilian Alina", 20, 2, 255);
        studenti[5] = new Student("Voievod Stefan", 35, 2, 255);
        studenti[6] = new Student("Balica Bogdan", 23, 4, 451);
        studenti[7] = new Student("Mitrut Andrei", 23, 4, 453);
        studenti[8] = new Student("Damian Anca", 19, 1, 133);
        studenti[9] = new Student("Bincu Maria", 20, 2, 233);
        studenti[10] = new Student("Marian Adelina", 21, 3, 344);
        studenti[11] = new Student("Marian Adelin", 21, 3, 344);
        studenti[12] = new Student("Marian Adela", 21, 3, 344);
        studenti[13] = new Student("Cotoi Mihaela", 20, 4, 453);
        studenti[14] = new Student("Petrut Pavel", 32, 5, 500);*/

        System.out.println("Lista studentilor:");
        for (int i = 0; i < studenti.size(); i++) {
            studenti.get(i).Afisare();
            System.out.println();
        }


        // Sortare in ordine alfabetica a studentilor

        //Arrays.sort(studenti);
        Collections.sort(studenti);

        System.out.println("Lista sortata cu studenti :");
        for (int i = 0; i < studenti.size(); i++) {
            studenti.get(i).Afisare();
            System.out.println();
        }

        // Downcasting de la student la sef de grupa + polimorfism dinamic

        Student student = new SefGrupa("Achim Laur", 23, 4, 455);
        SefGrupa sefgrupa = (SefGrupa) student;
        sefgrupa.Afisare();

        // Sef grupa - disponibbilitate

        sefgrupa.Semnaturi();

        // Verificare reinmatriculare an final


        int elevR, profesorR;
        Random indexRand = new Random();
        profesorR = indexRand.nextInt(4);
        elevR = indexRand.nextInt(14);
        studenti.get(elevR).Practica();


        // Instantiere si afisare Materii:

        Poo poo = new Poo(profesori.get(1), "Aplicatie bancara");
        poo.Afisare();
        Marketing mark = new Marketing(profesori.get(3), "Suply chain pentru emag");
        mark.Afisare();

        // Examen de laborator

        int[] grupa = {453,255};
        int grupaa = grupa[indexRand.nextInt(grupa.length)];
        Profesor laborant = profesori.get(profesorR);

        System.out.println("Grupa "+ grupaa + " a dat un examen de laborator cu profesorul : " + laborant.getNume() + " la materia " + laborant.getMaterie()+ " Notele sunt:" );
        for (Student studentul : studenti) {
            if (studentul.getGrupa() == grupaa)
                System.out.println("Studentul " + studentul.getNume() + " a obtinut nota " + poo.Test(laborant.getVarsta()));
        }

        // Intrare in licenta

        System.out.println("Perosanele care au promovat pot sustine licenta , ceilalti in toamna");
        for (int i=0;i<studenti.size();i++)
        {
            studenti.get(i).promovare(studenti.get(i), profesori.get(0), profesori.get(3), poo, mark);
        }

    }
}
