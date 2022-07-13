
public class Trener extends Osoba {
    private String vrijemeTreninga;
    private int cijenaTreninga;
    private int trenerId;
    

    public Trener(String ime, String prezime, Boolean spol, String datumRodenja, int kontaktBroj,
            String vrijemeTreninga, int cijenaTreninga, int trenerId) {
        super(ime, prezime, spol, datumRodenja, kontaktBroj);
        this.vrijemeTreninga = vrijemeTreninga;
        this.cijenaTreninga = cijenaTreninga;
        this.trenerId = trenerId;
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
    
    public int getTrenerId(){
        return trenerId;
    }
    public void setTrenerId(int trenerId){
        this.trenerId = trenerId;
    }
}
