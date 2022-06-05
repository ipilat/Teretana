import java.util.Date;

public class Osoba {
    private String ime;
    private String prezime;
    private Boolean spol;
    private Date datumRodenja;
    private int korisnikId;
    private int kontaktBroj;

    
    public Osoba(String ime, String prezime, Boolean spol, Date datumRodenja, int korisnikId, int kontaktBroj) {
        this.ime = ime;
        this.prezime = prezime;
        this.spol = spol;
        this.datumRodenja = datumRodenja;
        this.korisnikId = korisnikId;
        this.kontaktBroj = kontaktBroj;
    }

    public String getIme(){
        return ime;
    }
    public void setIme(String ime){
        this.ime=ime;
    }

    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }

    public Boolean getSpol() {
        return spol;
    }
    public void setSpol(Boolean spol){
        this.spol=spol;
    }

    public Date getDatumRodenja(){
        return datumRodenja;
    }
    public void setDatumRodenja(Date datumRodenja){
        this.datumRodenja=datumRodenja;
    }

    public int getKorisnikId(){
        return korisnikId;
    }
    public void setKorisnikId(int korisnikId){
        this.korisnikId=korisnikId;
    }

    public int getKontaktBroj(){
        return kontaktBroj;
    }
    public void setKontaktBroj(int kontaktBroj){
        this.kontaktBroj=kontaktBroj;
    }
}
