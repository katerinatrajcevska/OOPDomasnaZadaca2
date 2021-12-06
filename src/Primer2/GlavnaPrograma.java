package Primer2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class GlavnaPrograma {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();
        lista.add("Real Madrid");
        lista.add("FC Barcelona");
        lista.add("Manchester United");


        System.out.println("Listata sodrzi:" + lista.size() +  " elementi.");
        System.out.println("Se brishe elementot" + " " + lista.remove("Real Madrid"));
    }

}
