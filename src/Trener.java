
public class Trener extends Korisnik {
    private String vrijemeTreninga;
    private int cijenaTreninga;
    

    public Trener(String ime, String prezime, Boolean spol, String datumRodenja, int kontaktBroj, int trenerId,
            int clanskiBroj, int korisnikId, String vrijemeTreninga, int cijenaTreninga) {
        super(ime, prezime, spol, datumRodenja, kontaktBroj, trenerId, clanskiBroj, korisnikId);
        this.vrijemeTreninga = vrijemeTreninga;
        this.cijenaTreninga = cijenaTreninga;
    }

    public String getVrijemeTreninga() {
        return vrijemeTreninga;
    }

    public void setVrijemeTreninga(String vrijemeTreninga) {
        this.vrijemeTreninga = vrijemeTreninga;
    }

    public int getCijenaTreninga() {
        return cijenaTreninga;
    }

    public void setCijenaTreninga(int cijenaTreninga) {
        this.cijenaTreninga = cijenaTreninga;
    }
    
}
