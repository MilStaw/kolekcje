package pl.sda.zadanie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Winiarnia wina = new Winiarnia();
        wina.dodajWino(new Wina("Merlot1", Gatunek.WYTRAWNE, Typ.BIALE, 30, 17));
        wina.dodajWino(new Wina("Bianco", Gatunek.SLODKIE, Typ.BIALE, 30, 18));
        wina.dodajWino(new Wina("Losco", Gatunek.POLSLODKIE, Typ.CZERWONE, 30, 16));
        wina.dodajWino(new Wina("Gresso", Gatunek.WYTRAWNE, Typ.BIALE, 30, 18));
        wina.dodajWino(new Wina("Macri", Gatunek.POLWYTRAWNE, Typ.BIALE, 30, 17));
        wina.dodajWino(new Wina("Santer", Gatunek.WYTRAWNE, Typ.BIALE, 30, 19));

        List<Wina> biale = wina.pobierzWinaZaPomocaTypu(Typ.BIALE);
        System.out.println(biale);
        List<Wina> czerw = wina.pobierzWinaZaPomocaTypu(Typ.CZERWONE);
        System.out.println(czerw);
        List<Wina> slodkie = wina.pobierzWinaZaPomocaGatunku(Gatunek.SLODKIE);
        System.out.println(slodkie);
        List<Wina> polslodkie = wina.pobierzWinaZaPomocaGatunku(Gatunek.POLSLODKIE);
        System.out.println(polslodkie);
        List<Wina> wytrawne = wina.pobierzWinaZaPomocaGatunku(Gatunek.WYTRAWNE);
        System.out.println(wytrawne);
        List<Wina> polwytrawne = wina.pobierzWinaZaPomocaGatunku(Gatunek.POLWYTRAWNE);
        System.out.println(polwytrawne);


       System.out.println(wina);
    }
}
