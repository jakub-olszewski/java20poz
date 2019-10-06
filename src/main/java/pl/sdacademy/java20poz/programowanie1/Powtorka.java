package pl.sdacademy.java20poz.programowanie1;

import pl.sdacademy.java20poz.programowanie1.powtorka.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Powtorka {

    public static void main(String[] args) {

        List nazwaObiektuLista;// deklaracja
        // List - to interfejst nie zawiera implementacji

        nazwaObiektuLista = new ArrayList();// inicjalizacja
        // ArrayList - implementacja listy - tablicowa
        List lista2 = new LinkedList();
        // LinkedList - implementacja listy linkowanej

        // obiekt Mc Donald
        McDonald mcDonald = new McDonald();

        // tworzymy pojemnij na frytki
        Pudelko pojemnikNaFrytki = new Pudelko();

        // do pojemnika na frytki wrzucamy frytki z MC Donald
        Frytki frytki = mcDonald.poproszeFrytki();
        frytki.polejKetchupem();
        pojemnikNaFrytki.wloz(frytki);

        Telewizor telewizor = new Telewizor();
        telewizor.ustawKanal(5);
//
        PudelkoUniwersalne<Frytki> pudelkoUniwersalne = new PudelkoUniwersalne(frytki);
        pudelkoUniwersalne.pobierzZawartosc();

        Frytki frytkiZPudelkaUniwersalnego = pudelkoUniwersalne.pobierzZawartosc();

        pojemnikNaFrytki.wloz(frytkiZPudelkaUniwersalnego);

        // zrob klase Kanapka i wlozyc do pojemnika uniwersalnego

        List listaProduktow = new ArrayList<>();// List == List<Object>
        //   \ to lista obiektow
        List<Frytki> listaFrytek;
        //   \ to lista frytek


    }
}
