package Zadacha2;

public class KalkulatorZaDecimalniBroevi implements IMatematickiOperaciiVrzDecimalniBroevi {

    @Override
    public double odzemanje(double x, double y) {
        double razlika;
        razlika = x-y;
        return razlika;
    }

    @Override
    public double sobiranje(double x, double y) {
        double zbir;
        zbir = x+y;
        return zbir;
    }

    @Override
    public double mnozenje(double x, double y) {
        double proizvod;
        proizvod = x*y;
        return proizvod;
    }

    @Override
    public double delenje(double x, double y) {
        double kolicnik;
        kolicnik = x/y;
        return kolicnik;
    }

    @Override
    public double ostatok(double x, double y) {
        double ostatok;
        ostatok = x%y;
        return ostatok;
    }

    @Override
    public double stepenuvanje(double x, double y) {
        double stepenuvanje;
        stepenuvanje = Math.pow(x, y);
        return stepenuvanje;
    }
}