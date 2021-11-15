package Zadaca2;

public class Glavna {
    public static void main(String[] args) {
        Proizvod p = new Proizvod ();
        System.out.println("Imeto na proizvodot e: " + p.getImeNaProizvod());
        System.out.println("Proizvoditel na dadeniot proizvod e: " + p.getProizvoditelNaProizvodot());
        System.out.println("Cenata na dadeniot proizvod iznesuva: " + (int)p.getCenaNaProizvod());
        System.out.println("Tezhinata na proizvdot e: " + p.getTezhinaNaProizvodot());
    }
}