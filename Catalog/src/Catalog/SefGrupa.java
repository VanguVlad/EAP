package Catalog;


public class SefGrupa extends Student{

    public SefGrupa(String nume, int varsta, int an, int grupa) {
        super(nume, varsta, an, grupa);
    }

    @Override
    public void Afisare() {
        System.out.println("Studentul "+ this.nume+ " este seful grupei "+this.getGrupa());
    }

    @Override
    public void Semnaturi()
    {
        if(this.getAn()<3) System.out.println("Seful grupei "+this.getGrupa()+" va duce toate carnetele si legitimatile la semnat");
        else System.out.println("Seful grupei "+this.getGrupa()+" are alte obligatiuni si fiecare student trebuie sa mearga la secretariat pentru ai fi semnate documentele");
    }
}
