import java.util.*;
public class Covek
{
    private String Ime;
    private String Prezime;
    private String BrojNaIndeks;

    public Covek()
    {
        Ime="";
        Prezime="";
        BrojNaIndeks="";
    }
    public String getIme(){
        return Ime;
    }
    public String getPrezime(){
        return Prezime;
    }
    public String getBrojNaIndeks(){
        return BrojNaIndeks;
    }
    public void setIme(String Ime){
        this.Ime=Ime;
    }
    public void setPrezime(String Prezime){
        this.Prezime=Prezime;
    }
    public void setBrojNaIndeks(String BrojNaIndeks){
        this.BrojNaIndeks=BrojNaIndeks;
    }
    public void toStringCovek(){
        System.out.println(Ime+" "+Prezime+" "+BrojNaIndeks+" ");
    }
}
class Ocenka{
    private String Predmet;
    private String DatumNaIspit;
    private int Ocenka;

    public Ocenka()
    {
        Predmet="";
        DatumNaIspit="";
        Ocenka=0;
    }
    public String getPredmet(){
        return Predmet;
    }
    public String getDatumNaIspit(){
        return DatumNaIspit;
    }
    public int getOcenka(){
        return Ocenka;
    }
    public void setPredmet(String Predmet){
        this.Predmet=Predmet;
    }
    public void setDatumNaIspit(String DatumNaIspit){
        this.DatumNaIspit=DatumNaIspit;
    }
    public void setOcena(int Ocenka){
        this.Ocenka=Ocenka;
    }
    public void toStringOcenka(){
        System.out.println(Predmet+" "+DatumNaIspit+" "+Ocenka+" ");
    }
}
class Student extends Covek{

    private Ocenka []ocenka=new Ocenka[100];
    private int broj;

    public Student(){
        super();
        ocenka=null;
        broj=0;
    }
    public int getBroj(){
        return broj;
    }
    public Ocenka []getOcenka(){
        return ocenka;
    }
    public void setBroj(int broj){
        this.broj=broj;
    }
    public void setOcenka(Ocenka oc[]){

        this.ocenka=oc;
    }
    public void toStringStudent(){
        System.out.println();
        for(int i=0;i<broj;i++)
            System.out.println(ocenka[i]+" ");
    }
    public double prosek(){
        int sum=0;
        for(int i=0;i<broj;i++)
            sum=sum+ocenka[i].getOcenka();
        return sum/broj;
    }

}


