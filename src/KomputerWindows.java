public class KomputerWindows implements Komputer{
    public String Procesor;
    public String PlytaGlowna;
    public String KartaGraficzna;

    public KomputerWindows(String procesor, String plytaGlowna, String kartaGraficzna) {
        Procesor = procesor;
        PlytaGlowna = plytaGlowna;
        KartaGraficzna = kartaGraficzna;
    }

    @Override
    public void uruchom() {
        System.out.println("KomputerWindows uruchomiony");
    }

    @Override
    public void zepsujSie() {
        System.out.println("KomputerWindows zepsuty");
    }




}