package pl.sdacademy.java20poz.programowanie1.powtorka;

public class PudelkoUniwersalne<T> {

    private T zawartoscPudelka;

    public PudelkoUniwersalne(T toCoTrafiaDoPudelka) {
        zawartoscPudelka = toCoTrafiaDoPudelka;
    }

    public T pobierzZawartosc() {
        return zawartoscPudelka;
    }
}
