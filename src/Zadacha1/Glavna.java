package Zadacha1;

public class Glavna {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        KalkulatorZaCeliBroevi kalkulator = new KalkulatorZaCeliBroevi();
        System.out.println("Odzemanje na x i y e " + kalkulator.odzemanje(x, y));
        System.out.println("Sobiranje na x i y e " + kalkulator.sobiranje(x, y));
        System.out.println("Mnozenje na x i y e" + kalkulator.mnozenje(x, y));
        System.out.println("Delenje na x i y e " + kalkulator.delenje(x, y));
        System.out.println("Ostatok na x i y e " + kalkulator.ostatok(x, y));
        System.out.println("Stepenuvanje na x i y e " + kalkulator.stepenuvanje(x, y));
    }
}
