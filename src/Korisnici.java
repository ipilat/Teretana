import java.util.ArrayList;

public class Korisnici {
    
    //podatkovni član ArrayList za pohranu korisnika

    ArrayList<Korisnik> korisnici;

    //konstruktor koji će instancirati ArrayList

    public Korisnici(){
        korisnici = new ArrayList<Korisnik>();
    }

    // TODO: prikaz korisnika

    public void prikazKorisnika() {
        for(int i = 0; i < korisnici.size(); i++){
            //System.out.println(korisnici.get(i));
            System.out.println("----------------------------------");
            System.out.println("Ime : " + korisnici.get(i).getIme());
            System.out.println("Prezime : " + korisnici.get(i).getPrezime());
            System.out.println("Spol : " + korisnici.get(i).getSpol());
            System.out.println("DatumRodenja : " + korisnici.get(i).getDatumRodenja());
            System.out.println("KontaktBroj : " + korisnici.get(i).getKontaktBroj());
            System.out.println("TrenerId : " + korisnici.get(i).getTrenerId());
            System.out.println("ClanskiBroj : " + korisnici.get(i).getClanskiBroj());
            System.out.println("KorisnikId : " + korisnici.get(i).getKorisnikId());
        }

          if(korisnici.isEmpty()) {
            System.out.println("KorisniciList prazan");
        } else {
            System.out.println("KorisniciList pun");
        }
    }

    // TODO: brisanje

    public void obrisiKorisnika(Korisnik korisnik){
        korisnici.remove(korisnik);
    }

    // TODO: azuriranje, metoda za getKorisnikId()

    public void azurirajKorisnika(Korisnik korisnik){
        //korisnik.update(korisnik);
        for(int i = 0; i < korisnici.size(); i++){
            //korisnici.set(korisnici.get(i).getKorisnikId(),korisnik);
        }
    }

    //metodu za unos objekta tipa Korisnik u podatkovni član ArrayList
    public void dodajKorisnika(Korisnik korisnik){
            korisnici.add(korisnik);
    }
}
