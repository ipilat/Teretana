import java.util.Date;

public class Osoba {
    private String ime;
    private String prezime;
    private Boolean spol;
    private Date datumRodenja;
    private int korisnikId;
    private int kontaktBroj;


    public String getIme(){
        return this.ime;
    }
    public void setIme(String ime){
        this.ime=ime;
    }

    public String getPrezime(){
        return this.prezime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }

    public Boolean getSpol() {
        return this.spol;
    }
    public void setSpol(Boolean spol){
        this.spol=spol;
    }

    public Date getDatumRodenja(){
        return this.datumRodenja;
    }
    public void setDatumRodenja(Date datumRodenja){
        this.datumRodenja=datumRodenja;
    }

    public int getKorisnikId(){
        return this.korisnikId;
    }
    public void setKorisnikId(int korisnikId){
        this.korisnikId=korisnikId;
    }

    public int getKontaktBroj(){
        return this.kontaktBroj;
    }
    public void setKontaktBroj(int kontaktBroj){
        this.kontaktBroj=kontaktBroj;
    }
}
