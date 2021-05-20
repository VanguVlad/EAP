package Service;
import Catalog.Marketing;
import Catalog.Student;
import Catalog.Poo;
import Catalog.Profesor;


public interface Serviciu {

    default void Afisare() {}

    default void Practica(){}

    default void Semnaturi() {}

    default void promovare(Student elevi, Profesor profesor,Profesor prof, Poo poo, Marketing marketing) {

    }

}
