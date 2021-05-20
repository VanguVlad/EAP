package Catalog;

import Service.LoggerCsv;

public class Marketing extends Materie{
    private String studiudecaz;
    private LoggerCsv log = new LoggerCsv();

    public Marketing(Profesor profesor, String studiudecaz) {
        super(profesor);
        this.studiudecaz=studiudecaz;
    }

    public String getStudiuCaz() {
        return studiudecaz;
    }

    public void setStudiuCaz(String studiudecaz) {
        this.studiudecaz = studiudecaz;
    }

    @Override
    public void Afisare() {
        log.info(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(" Cursul de Marketing este sustinut de : "+this.profesor.getNume()+" care a cerut urmatorul studiu de caz: "+this.studiudecaz);
    }

}
