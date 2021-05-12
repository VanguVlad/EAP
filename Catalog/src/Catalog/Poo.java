package Catalog;

public class Poo extends Materie{
    private String proiect;

    public Poo(Profesor profesor, String proiect) {
        super(profesor);
        this.proiect=proiect;
    }

    public String getProiect() {
        return proiect;
    }

    public void setProiect(String proiect) {
        this.proiect = proiect;
    }

    @Override
    public void Afisare() {
        System.out.println(" Cursul de Poo este sustinut de : "+this.profesor.getNume()+" care a cerut urmatorul proiect: "+this.proiect);
    }

}
