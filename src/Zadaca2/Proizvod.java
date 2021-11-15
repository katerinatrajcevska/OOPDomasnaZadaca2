package Zadaca2;

public class Proizvod {
    private String imeNaProizvod;
    private double cenaNaProizvod;
    private String proizvoditelNaProizvodot;
    private double tezhinaNaProizvodot;

    public Proizvod () {
        this.imeNaProizvod = "Milka";
        this.cenaNaProizvod = 80;
        this.proizvoditelNaProizvodot = "Svajcarija";
        this.tezhinaNaProizvodot = 100;
    }

    public String getImeNaProizvod() {
        return imeNaProizvod;
    }

    public void setImeNaProizvod(String imeNaProizvod) {
        this.imeNaProizvod = imeNaProizvod;
    }

    public double getCenaNaProizvod() {
        return cenaNaProizvod;
    }

    public void setCenaNaProizvod(double cenaNaProizvod) {
        this.cenaNaProizvod = cenaNaProizvod;
    }

    public String getProizvoditelNaProizvodot() {
        return proizvoditelNaProizvodot;
    }

    public void setProizvoditelNaProizvodot(String proizvoditelNaProizvodot) {
        this.proizvoditelNaProizvodot = proizvoditelNaProizvodot;
    }

    public double getTezhinaNaProizvodot() {
        return tezhinaNaProizvodot;
    }

    public void setTezhinaNaProizvodot(double tezhinaNaProizvodot) {
        this.tezhinaNaProizvodot = tezhinaNaProizvodot;
    }
}
