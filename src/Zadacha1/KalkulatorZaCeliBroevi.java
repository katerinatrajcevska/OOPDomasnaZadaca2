package Zadacha1;

public class KalkulatorZaCeliBroevi implements IMatematickiOperaciiCeliBroevi {

    @Override
    public int odzemanje(int x, int y) {
        int razlika;
        razlika = x-y;
        return razlika;
    }

    @Override
    public long sobiranje(int x, int y) {
        long zbir;
        zbir = x+y;
        return zbir;
    }

    @Override
    public long mnozenje(int x, int y) {
        long proizvod;
        proizvod = x*y;
        return proizvod;
    }

    @Override
    public long delenje(int x, int y) {
        long kolicnik;
        kolicnik = x/y;
        return kolicnik;
    }

    @Override
    public int ostatok(int x, int y) {
        int ostatok;
        ostatok = x%y;
        return ostatok;
    }

    @Override
    public long stepenuvanje(int x, int y) {
        long stepenuvanje;
        stepenuvanje = (long)Math.pow(x,y);
        return stepenuvanje;
    }
}