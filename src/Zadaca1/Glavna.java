package Zadaca1;


import java.util.ArrayList;
import java.util.List;

public class Glavna {

    public static void main(String[] args) {
        MetodiZaListaNiza m = new MetodiZaListaNiza();
        List<String> lista = new ArrayList<String>();
        lista.add("K");
        lista.add("L");
        lista.add("I");
        m.listToArray(lista);

        String [] niza = {"k","l","i"};
        m.arrayToList(niza);
    }
}