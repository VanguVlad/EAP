package Catalog;
import Service.Serviciu;
import java.util.Random;
import java.text.DecimalFormat;


public abstract class Materie implements Serviciu {

    Profesor profesor;
    Materie(Profesor profesor) {

        this.profesor = profesor;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public abstract void Afisare();

    Random rand= new Random();
    public int Test(int varsta) {
        int notaElev;
        notaElev = rand.nextInt(10) + 1;
        if (notaElev < 5 && varsta < 33)
            notaElev = 5;
        if (varsta > 45 && notaElev>2) notaElev--;
        return notaElev;
    }

}
