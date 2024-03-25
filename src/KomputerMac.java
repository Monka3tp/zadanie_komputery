public class KomputerMac implements Komputer{
    public String Procesor;
    public String PlytaGlowna;
    public String KartaGraficzna;

    public KomputerMac(String procesor, String plytaGlowna, String kartaGraficzna) {
        Procesor = procesor;
        PlytaGlowna = plytaGlowna;
        KartaGraficzna = kartaGraficzna;
    }

    @Override
    public void uruchom() {
        System.out.println("KomputerMac uruchomiony");
    }

    @Override
    public void zepsujSie() {
        System.out.println("KomputerMac zepsuty");
    }




}