package Zadaca1;

public class Glavna {
    public static void main(String [] args) {
        Restoran r=new Restoran();
        r.setImeNaRestoran("Epinal");
        r.setLokacija("Sirok Sokak");
        r.setTelefon("070/222/222");
        r.setBrojNaSedista("55");

        System.out.println("Ime na restoranot" + " " +  r.getImeNaRestoran());
        System.out.println("Lokacija na restoranot" + " " + r.getLokacija());
        System.out.println("Telefon na restoranot" + " " + r.getTelefon());
        System.out.println("Broj na sedista vo restoranot" + " " + r.getBrojNaSedista());
    }
}
