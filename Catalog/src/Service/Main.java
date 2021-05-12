package Service;

import Catalog.*;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        //Instantiere si afisare  Decan

        new Decan();
        Decan.AfisareDecan();


        // Initializari si afisari studenti si profesori
        Profesor[] profi = new Profesor[4];
        profi[0] = new Profesor("Dragan Andrei", 55, "Poo");
        profi[1] = new Profesor("Banu Laur", 60, "Poo");
        profi[2] = new Profesor("Simion Mariana", 28, "Marketing");
        profi[3] = new Profesor("Gratu Andra Maria", 30, "Marketing");

        System.out.println("Lista Profesorilor:");
        for (int i = 0; i < profi.length; i++) {
            profi[i].Afisare();
            System.out.println();
        }

        Student[] studenti = new Student[15];
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
        studenti[14] = new Student("Petrut Pavel", 32, 5, 500);

        System.out.println("Lista studentilor:");
        for (int i = 0; i < studenti.length; i++) {
            studenti[i].Afisare();
            System.out.println();
        }


        // Sortare in ordine alfabetica a studentilor

        Arrays.sort(studenti);

        System.out.println("Lista sortata cu studenti :");
        for (int i = 0; i < studenti.length; i++) {
            studenti[i].Afisare();
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
        studenti[elevR].Practica();


        // Instantiere si afisare Materii:

        Poo poo = new Poo(profi[1], "Aplicatie bancara");
        poo.Afisare();
        Marketing mark = new Marketing(profi[3], "Suply chain pentru emag");
        mark.Afisare();

        // Examen de laborator

        int[] grupa = {453,255};
        int grupaa = grupa[indexRand.nextInt(grupa.length)];
        Profesor laborant = profi[profesorR];

        System.out.println("Grupa "+ grupaa + " a dat un examen de laborator cu profesorul : " + laborant.getNume() + " la materia " + laborant.getMaterie()+ " Notele sunt:" );
        for (Student studentul : studenti) {
            if (studentul.getGrupa() == grupaa)
                System.out.println("Studentul " + studentul.getNume() + " a obtinut nota " + poo.Test(laborant.getVarsta()));
        }

        // Intrare in licenta

        System.out.println("Perosanele care au promovat pot sustine licenta , ceilalti in toamna");
        for (int i=0;i<studenti.length;i++)
        {
            studenti[i].simulare(studenti[i],profi[0],profi[3],poo,mark);
        }

    }
}
