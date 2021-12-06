package Zadaca2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {

    public static void main(String[] args) {
        List<SportskiKlub> list = new ArrayList<SportskiKlub>();
        list.add(new SportskiKlub("Real Madrid", "Fudbal", 19));
        list.add(new SportskiKlub("FC Barcelona", "Fudbal", 15));
        list.add(new SportskiKlub("Juventus F.C.", "Fudbal", 17));

        Collections.sort(list);
        for (SportskiKlub a : list) {
            System.out.println(a.getIme());
            System.out.println(a.getSport());
            System.out.println(a.getBrojClenovi());
            System.out.println();
        }
    }
}
