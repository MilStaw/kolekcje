package pl.sda.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Winiarnia {
    List<Wina> wina = new ArrayList<>();


    public void dodajWino(Wina wino) {                      // ta metoda dodaje wina po nazwie, typie, cenie itd...
        wina.add(wino);
    }

    public List<Wina> pobierzWinaZaPomocaNazwy(String nazwa) {
        List<Wina> tymczasowe = new ArrayList();
        for (int i = 0; i < wina.size(); i++) {
            if (wina.get(i).getNazwa().equals(nazwa)) {
                tymczasowe.add(wina.get(i));
            }
        }
        return tymczasowe;
    }

    public List<Wina> pobierzWinaZaPomocaTypu(Typ typ) {
        List<Wina> tymczasowe = new ArrayList();
        for (int i = 0; i < wina.size(); i++) {
            if (wina.get(i).getTyp() == typ) {
                tymczasowe.add(wina.get(i));
            }
        }
        return tymczasowe;
    }

    public List<Wina> pobierzWinaZaPomocaGatunku(Gatunek gatunek) {
        List<Wina> tymczasowe = new ArrayList();
        for (int i = 0; i < wina.size(); i++) {
            if (wina.get(i).getGatunek() == gatunek) {
                tymczasowe.add(wina.get(i));
            }
        }
        return tymczasowe;
    }

    public List<Wina> pobierzWinaZaPomocaCeny(int cena) {
        List<Wina> tymczasowe = new ArrayList();
        for (int i = 0; i < wina.size(); i++) {
            if (wina.get(i).getCena() == cena) {
                tymczasowe.add(wina.get(i));
            }
        }
        return tymczasowe;
    }

    public List<Wina> pobierzWinaZaPomocaIlosciAlkoholu(int iloscAlkoholu) {
        List<Wina> tymczasowe = new ArrayList();
        for (int i = 0; i < wina.size(); i++) {
            if (wina.get(i).getIloscAlkoholu() == iloscAlkoholu) {
                tymczasowe.add(wina.get(i));
            }
        }
        return tymczasowe;
    }
}












