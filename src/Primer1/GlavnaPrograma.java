package Primer1;
import java.util.ArrayList;
import java.util.List;
public class GlavnaPrograma {
    public static void main(String [] args){
        List<String> lista = new ArrayList<>();
        lista.add("FIKT");
        lista.add("TFB");
        lista.add("FINKI");

        System.out.println("Listata sodrzi:" + lista.size() + "elementi.");
        System.out.println("Elementite na listata se:" + lista);
    }

}
