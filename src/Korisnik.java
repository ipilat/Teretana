//import java.util.Date;

public class Korisnik extends Osoba {
    private int trenerId;
    private int clanskiBroj;
    private int korisnikId;

    public Korisnik(String ime, String prezime, Boolean spol, String datumRodenja, int kontaktBroj, int trenerId,
            int clanskiBroj, int korisnikId) {
        super(ime, prezime, spol, datumRodenja, kontaktBroj);
        this.trenerId = trenerId;
        this.clanskiBroj = clanskiBroj;
        this.korisnikId = korisnikId;
    }

    public int getTrenerId(){
        return trenerId;
    }
    public void setTrenerId(int trenerId){
        this.trenerId=trenerId;
    }

    public int getClanskiBroj(){
        return clanskiBroj;
    }
    public void setClanskiBroj(int clanskiBroj){
        this.clanskiBroj=clanskiBroj;
    }

    public int getKorisnikId(){
        return korisnikId;
    }
    public void setKorisnikId(int korisnikId){
        this.korisnikId=korisnikId;
    }
}
