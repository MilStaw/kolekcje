package pl.sda.zadanie;

public class Wina {
    public String nazwa;
    public Gatunek gatunek;
    public Typ  typ;
    public int cena;
    public int iloscAlkoholu;

    public Wina(String nazwa, Gatunek gatunek, Typ typ, int cena, int iloscAlkoholu) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.typ = typ;
        this.cena = cena;
        this.iloscAlkoholu = iloscAlkoholu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(Gatunek gatunek) {
        this.gatunek = gatunek;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getIloscAlkoholu() {
        return iloscAlkoholu;
    }

    public void setIloscAlkoholu(int iloscAlkoholu) {
        this.iloscAlkoholu = iloscAlkoholu;
    }



    @Override
    public String toString() {
        return "Wina{" +
                "nazwa='" + nazwa + '\'' +
                ", gatunek=" + gatunek +
                ", typ=" + typ +
                ", cena=" + cena +
                ", iloscAlkoholu=" + iloscAlkoholu +
                '}';
    }


}








