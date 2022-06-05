import java.util.ArrayList;

public class Korisnici {
    
    //podatkovni član ArrayList za pohranu korisnika

    ArrayList <Korisnik> korisnici = new ArrayList<>();

    //konstruktor koji će instancirati ArrayList

    public Korisnici(){
        
    }

    //metodu za unos objekta tipa Korisnik u podatkovni član ArrayList

    public void dodajKorisnika(Korisnik korisnik){
        for(int i=0;i<korisnici.size();i++){
            //korisnici.add(new Korisnik(ime, prezime, spol, datumRodenja, korisnikId, kontaktBroj, trenerId, clanskiBroj));
        }
    }
}
