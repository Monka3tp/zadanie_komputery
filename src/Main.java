import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        KomputerMac komputerMac1 = new KomputerMac("procesor","plyta","karta");
        KomputerWindows komputerWindows1 = new KomputerWindows("procesor","plyta","karta");

        ArrayList<Komputer> komputery = new ArrayList<>();
        komputery.add(komputerMac1);
        komputery.add(komputerWindows1);

        Collections.sort(komputery);

        for(Komputer k:komputery){
            System.out.println(k.getClass().getName());
            System.out.println(k);
            k.uruchom();
            k.zepsujSie();
        }
    }
}