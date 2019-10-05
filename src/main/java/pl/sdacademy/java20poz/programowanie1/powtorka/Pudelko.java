package pl.sdacademy.java20poz.programowanie1.powtorka;

public class Pudelko {

    Frytki zawartosc;

    public void wloz(Frytki frytki) {
        System.out.println("Do pudelka trafia "+frytki);
        zawartosc = frytki;
        // frytki == frytki.toString()
    }
}
