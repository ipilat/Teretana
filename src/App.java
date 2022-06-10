public class App {
    public static void main(String[] args) throws Exception {
        // TODO: instancirati Korisnici
        
        Korisnik korisnik = new Korisnik("Ivan","Navi",true,"1999-12-05",22334,222454566,33324,32333);
        Korisnik korisnik2 = new Korisnik("Marko","Peric",true,"1999-12-05",0231455,22334,33324,32311);

        Korisnici kor = new Korisnici();
        kor.dodajKorisnika(korisnik);
        kor.dodajKorisnika(korisnik2);
        //kor.dodajKorisnika(korisnik);
        //kor.obrisiKorisnika(korisnik2);
        kor.prikazKorisnika();
    }
}
