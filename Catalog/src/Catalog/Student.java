package Catalog;

public class Student extends Persoana implements Comparable<Student> {
    private int an;
    private int grupa;
    public Student(String nume,int varsta, int an, int grupa)
    {
        super(nume,varsta);
        this.an=an;
        this.grupa=grupa;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an=an;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(char grupa) {
        this.grupa=grupa;
    }


    public void Practica() {
        if(getAn() == 5)
        System.out.println(this.nume+" este rugat sa depuna actele necesare pentru reinmatriculare in anul 4");
        else
            System.out.println(" Studentul: "+ this.nume+" poate sta linistit");

    }

    @Override
    public void Afisare() {
        System.out.println(this.nume+" este Student in anul "+ this.an+" grupa:"+this.grupa);
    }




    @Override
    public int compareTo(Student student) {
        String nume = this.nume;
        String comparat = student.nume;
        return nume.compareTo(comparat); // in ordine alfabetica
    }

    @Override
    public void simulare(Student student, Profesor profesor, Profesor prof, Poo poo, Marketing marketing)
    {
        if(student.getAn()==4)
        {
            double notaPoo=poo.Test(profesor.getVarsta());
            double notaMarketing=marketing.Test(prof.getVarsta());
            if (notaMarketing>=5 && notaPoo>=5 )
            System.out.println("Studentul "+student.getNume()+" a promovat");
            else
                System.out.println("Studentul "+student.getNume()+" a picat");

        }
    }
}
