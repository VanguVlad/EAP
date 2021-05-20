package Catalog;

public final class Decan {   ///Clasa de tip singleton
    private static String nume;


    public static void getDecan() {
        if (nume == null) nume = "Vlad Vangu";
    }
    public static void AfisareDecan()
    {
        getDecan();
        System.out.println(nume+" este decanul faculatatii \n");
    }
}