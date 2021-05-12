package Catalog;

public class Profesor extends Persoana {
    protected String materie;
    public Profesor(String nume, int varsta, String materie)
    {
        super(nume,varsta);
        this.materie=materie;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }


    @Override
    public void Afisare() {
        System.out.println(this.nume+" este Profesor la materia "+ this.materie );
    }


}
