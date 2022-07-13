import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.*;
import java.nio.file.Paths;

public class Korisnici {
    
    //podatkovni član ArrayList za pohranu korisnika

    ArrayList<Korisnik> korisnici;

    //konstruktor koji će instancirati ArrayList

    public Korisnici(){
        //korisnici = new ArrayList<Korisnik>();
        deserializacijaKorisnika();
    }


    public void prikazKorisnika() {
        for(int i = 0; i < korisnici.size(); i++){
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



    public void obrisiKorisnika(Korisnik korisnik){
        int index = dohvatiKorisnika(korisnik);
        if (index != -1) {
            korisnici.remove(index);
        }
        serializacijaKorisnika();
    }


    public void azurirajKorisnika(Korisnik korisnik){
        int index = dohvatiKorisnika(korisnik);
        if (index != -1) {
            korisnici.set(index, korisnik);
        }
        serializacijaKorisnika();
    }

    public int dohvatiKorisnika(Korisnik korisnik){
        for(int i = 0; i < korisnici.size(); i++){
            if (korisnici.get(i).getKorisnikId() == korisnik.getKorisnikId()) {
                return i;
            }
        }
        return -1;
    }

    //metodu za unos objekta tipa Korisnik u podatkovni član ArrayList
    public void dodajKorisnika(Korisnik korisnik){
            korisnici.add(korisnik);
            serializacijaKorisnika();
    }

    public void serializacijaKorisnika() {
        
        try{
            
            //kreiran writer
            Writer writer = new FileWriter("korisnici.json");
    
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            //convertanje liste u JSON File
            gson.toJson(korisnici, writer);

            writer.close();
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void deserializacijaKorisnika(){
        try {
            String data = new String(Files.readAllBytes(Paths.get("korisnici.json")));
            Gson gson = new Gson();
            korisnici = gson.fromJson(data, new TypeToken<ArrayList<Korisnik>>(){}.getType());
        } catch(Exception e) {
            System.out.println("Nije moguce ucitati podatke o korisniku");
        }
    }
}
