package pl.sdacademy.java20poz.programowanie1.powtorka;

public class BankomatImpl implements Bankomat {

    Pieniadze puszkaNaPieniadze;

    @Override
    public Pieniadze pobierz() {
        return puszkaNaPieniadze;
    }
}
