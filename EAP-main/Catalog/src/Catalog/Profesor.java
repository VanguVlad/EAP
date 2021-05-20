package Catalog;
import Service.LoggerCsv;

public class Profesor extends Persoana {
    protected String materie;
    private LoggerCsv log = new LoggerCsv();
    public Profesor(String nume, int varsta, String materie)
    {
        super(nume,varsta);
        this.materie=materie;
    }

    public String getMaterie() {
        log.info(Thread.currentThread().getStackTrace()[1].getMethodName());
         return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }
    
    public String toCsvString() {
    	return this.nume + "," + this.varsta + "," + this.materie;
    }


    @Override
    public void Afisare() {
        System.out.println(this.nume+" este Profesor la materia "+ this.materie );
    }


}
