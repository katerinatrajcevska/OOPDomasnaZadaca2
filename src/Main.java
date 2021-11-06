import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n;
        String Ime,Prezime,BrojNaIndeks,Predmet,DatumNaIspit;
        int broj,ocenka;
        Scanner sc=new Scanner(System.in);
        System.out.println("Vnesete broj na studenti za presmetka na prosek na studiranje : ");
        n=sc.nextInt();
        Student niza[]=new Student[100];
        for(int i=0;i<n;i++)
        {
            Student s=new Student();
            System.out.println("Vnesete ime na studentot : ");
            Ime=sc.next();
            System.out.println("Vnesete prezime na studentot : ");
            Prezime=sc.next();
            System.out.println("Vnesete broj na indeks na studentot : ");
            BrojNaIndeks=sc.next();
            System.out.println("Vnesete broj na predemeti : ");
            broj=sc.nextInt();
            s.setIme(Ime);
            s.setPrezime(Prezime);
            s.setBrojNaIndeks(BrojNaIndeks);
            s.setBroj(broj);
            Ocenka []o=new Ocenka[100];
            for(int j=0;j<broj;j++)
            {
                Ocenka ol=new Ocenka();
                System.out.println("Vnesete ime na predemet  : ");
                Predmet=sc.next();
                System.out.println("Vnesete datum na polaganje na predemetot : ");
                DatumNaIspit=sc.next();
                System.out.println("Vnesete ocenka za predmetot : ");
                ocenka=sc.nextInt();
                ol.setPredmet(Predmet);
                ol.setDatumNaIspit(DatumNaIspit);
                ol.setOcena(ocenka);
                o[j]=ol;
            }
            s.setOcenka(o);
            niza[i]=s;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println();
            niza[i].toStringCovek();
            for(int j=0;j<niza[i].getBroj();j++)
            {
                System.out.print(" " +niza[i].getOcenka()[j].getPredmet()+" ");
                System.out.print(niza[i].getOcenka()[j].getDatumNaIspit()+" ");
                System.out.print(niza[i].getOcenka()[j].getOcenka()+" ");

            }
            System.out.print(niza[i].prosek());
        }
    }

}
