package Zadaca3;

public class Avtomobil {

    private String markaNaAvtomobil;
    private String modelNaAvtomobil;
    private double pominatiKm;
    private String bojaNaAvtomobil;
    public Avtomobil(String markaNaAvtomobil, String modelNaAvtomobil, double pominatiKm, String bojaNaAvtomobil) {
        this.markaNaAvtomobil = markaNaAvtomobil;
        this.modelNaAvtomobil = modelNaAvtomobil;
        this.pominatiKm = pominatiKm;
        this.bojaNaAvtomobil = bojaNaAvtomobil;
    }

    public double mnozenjeKm(double pomnoziKm) {
        double vkupnoKm = this.pominatiKm * pomnoziKm;
        return vkupnoKm;
    }

    public String getMarkaNaAvtomobil() {
        return markaNaAvtomobil;
    }

    public void setMarkaNaAvtomobil(String markaNaAvtomobil) {
        this.markaNaAvtomobil = markaNaAvtomobil;
    }

    public String getModelNaAvtomobil() {
        return modelNaAvtomobil;
    }

    public void setModelNaAvtomobil(String modelNaAvtomobil) {
        this.modelNaAvtomobil = modelNaAvtomobil;
    }

    public double getPominatiKm() {
        return pominatiKm;
    }

    public void setPominatiKm(double pominatiKm) {
        this.pominatiKm = pominatiKm;
    }

    public String getBojaNaAvtomobil() {
        return bojaNaAvtomobil;
    }

    public void setBojaNaAvtomobil(String bojaNaAvtomobil) {
        this.bojaNaAvtomobil = bojaNaAvtomobil;
    }
}