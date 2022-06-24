public class App {
    public static void main(String[] args) throws Exception {
        // TODO: instancirati Korisnici
        
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

        //Trener trener = new Trener("Netko","Nesto",1, "1994-09-05", 4554455, 405, 116, 562, "2h", 320);
        Trener trener1 = new Trener("Netko","Nesto",false,"1994-09-05",4554455,302,405,553,"2h",320);
        
        Treneri tren = new Treneri();
        tren.dodajTrenera(trener1);
        //tren.prikazTrenera();


        //kor.prikazKorisnika();
    }
}
