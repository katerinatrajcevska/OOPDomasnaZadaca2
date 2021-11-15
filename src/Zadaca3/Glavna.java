package Zadaca3;

public class Glavna {

    public static void main(String[] args) {
        Avtomobil a = new Avtomobil("Opel", "Corsa", 456655, "Crvena");

        System.out.println("Marka na avtomobilot e: " + a.getMarkaNaAvtomobil());
        System.out.println("Model na avtomobilot e: " + a.getModelNaAvtomobil());
        System.out.println("Kilometri pred da se izvrsi  mnozhenjeto se: " + a.getPominatiKm());
        System.out.println("Kilometri posle izvrsuvanjeto na  mnozhenjeto se: " + a.mnozenjeKm(5));
        System.out.println("Boja na avtomobilot e : " + a.getBojaNaAvtomobil());
    }
}

