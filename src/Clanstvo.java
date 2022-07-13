

public class Clanstvo {
    private int cijenaPaketa;
    private String imePaketa;
    private int korisnikId;
    
    public Clanstvo(int cijenaPaketa, String imePaketa, int korisnikId) {
        this.cijenaPaketa = cijenaPaketa;
        this.imePaketa = imePaketa;
        this.korisnikId = korisnikId;
    }
    
    public int getCijenaPaketa() {
        return cijenaPaketa;
    }
    public void setCijenaPaketa(int cijenaPaketa) {
        this.cijenaPaketa = cijenaPaketa;
    }
    public String getImePaketa() {
        return imePaketa;
    }
    public void setImePaketa(String imePaketa) {
        this.imePaketa = imePaketa;
    }
    public int getKorisnikId() {
        return korisnikId;
    }
    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }
    
}
