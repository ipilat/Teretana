import java.util.Date;

public class Korisnik extends Osoba {
    private int trenerId;
    private int clanskiBroj;

    public Korisnik(String ime, String prezime, Boolean spol, Date datumRodenja, int korisnikId, int kontaktBroj,
            int trenerId, int clanskiBroj) {
        super(ime, prezime, spol, datumRodenja, korisnikId, kontaktBroj);
        this.trenerId = trenerId;
        this.clanskiBroj = clanskiBroj;
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
}
