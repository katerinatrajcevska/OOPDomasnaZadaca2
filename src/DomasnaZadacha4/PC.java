package DomasnaZadacha4;

public class PC {
    public int Memorija;
    public String tipNaMemorija;
    public int hardDisk;
    public String Disk;
    public String SSD;
    public String Golemina="GB";

    public PC() {
        this.Memorija=2;
        this.tipNaMemorija="DDR4";
        this.hardDisk=160;
        this.Disk="HDD";
        this.SSD="SSD m.2";

    }
    public void prvMetod(int zgolemiMemorija, int novSSDdisk) {
        System.out.println("Memorijata bese "+this.Memorija+Golemina +", sega iznesuva "+(zgolemiMemorija + Memorija)+ Golemina);
        System.out.println("Tipot na memorijata e "+this.tipNaMemorija+".");
        System.out.println("Noviot disk e " +this.SSD+" ima golemina od "+novSSDdisk + Golemina+". Prethodno imavme "+this.Disk+" i iznesuvase "+ this.hardDisk+ Golemina +".");
    }
}
