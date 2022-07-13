public class App {
    public static void main(String[] args) throws Exception {
        //  instancirati Korisnici
        
        //Korisnik korisnik = new Korisnik("Ivan","Navi",true,"1999-12-05",22334,222454566,33324,32333);
        //Korisnik korisnik2 = new Korisnik("Marko","Peric",true,"1999-12-05",0231455,22334,33324,32311);

        //Korisnici kor = new Korisnici();
        //kor.dodajKorisnika(korisnik2);
        //kor.dodajKorisnika(korisnik2);
        //kor.dodajKorisnika(korisnik);
        //kor.obrisiKorisnika(korisnik2);
        //kor.dohvatiIdKorisnika();
        //kor.serializacijaKorisnika();
        //kor.deserializacijaKorisnik();
        //Korisnik korisnik3 = kor.get(0);
        //Korisnik korisnik = new Korisnik("Proba","Navi",true,"1999-12-05",22334,222454566,33324,32334);
        //kor.dodajKorisnika(korisnik);

        //korisnik.setIme("Proba2");
        //kor.azurirajKorisnika(korisnik);
        //kor.obrisiKorisnika(korisnik);

        //Korisnici kor2 = new Korisnici();
        //kor2.prikazKorisnika();

        //Trener trener = new Trener("Netko","Nesto",true, "1994-09-05", 4554455, 405, 116, 562, "2h", 320);
        //Trener trener = new Trener("Mirko", "Nikic", true, "22-02-2004", 134, "2h", 50, 232);
        Trener trener = new Trener("Marko","Petrovic",true,"1992-05-12", 235467,"4h", 100, 237);
        
        Treneri tren = new Treneri();
        tren.dodajTrenera(trener);
        //tren.obrisiTrenera(trener);
        tren.prikazTrenera();

        Clanstvo clanstvo = new Clanstvo(260, "ImePaketa", 232);
        Clanstvo clanstvo1 = new Clanstvo(254, "Fitness", 236);

        Clanstva clan = new Clanstva();
        //clan.dodajClanstvo(clanstvo1);
        //clan.dodajClanstvo(clanstvo);
        //clan.obrisiClanstvo(clanstvo);
        clan.azurirajClanstva(clanstvo);
        clan.prikazClanstva();


        //kor.prikazKorisnika();
    }
}
