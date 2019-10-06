package pl.sdacademy.java20poz.programowanie1.powtorka;

public class Kanapka {

    String skladnik;

    /**
     * skladnik ---> "salata"
     * @param skladnik
     */
    public void dodajSkladnik(String skladnik){
        this.skladnik = skladnik;
    }

    public static void main(String[] args) {
        Kanapka kanapkaZSalata = new Kanapka();
        kanapkaZSalata.dodajSkladnik("salata");
    }
}
