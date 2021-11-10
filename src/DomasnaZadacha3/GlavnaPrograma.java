package DomasnaZadacha3;

import java.util.Scanner;

public class GlavnaPrograma {public static void main(String[] args) {
    int Shansi;

    Brojach b = new Brojach();
    Brojach r = new Brojach();

    Scanner sc = new Scanner (System.in);
    System.out.println("Внесете колку шанси има кандидатот да ја фрли паричката: ");
    Shansi = sc.nextInt();

    while (Shansi > 0) {
        b.ResetirajBrojach();
        r.ResetirajBrojach();

        for(int i=0; i<Shansi; i++)
        {
            if(Math.random() < 0.5)
                b.ZgolemiBrojach();
            else
                r.ZgolemiBrojach();
        }
        System.out.println("Од дадените " + Shansi + " шанси:");
        System.out.println(b.brojach + " пати се падна писмо. ");
        System.out.println(r.brojach + " пати се падна глава.");

        System.out.println("Внесете шанси за повторно фрлање на паричката: ");
        Shansi = sc.nextInt();

    }
    sc.close();
}
}
