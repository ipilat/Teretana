import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.*;
import java.nio.file.Paths;

public class Treneri{
    
    
    ArrayList<Trener> treneri;
    
    
    public Treneri() {
        treneri = new ArrayList<Trener>();
        deserializacijaTrenera();
    }
    
    //po uzoru na korisnici

    public void prikazTrenera() {
        for(int i = 0; i < treneri.size(); i++){
            System.out.println("----------------------------------");
            System.out.println("Ime : " + treneri.get(i).getIme());
            System.out.println("Prezime : " + treneri.get(i).getPrezime());
            System.out.println("Spol : " + treneri.get(i).getSpol());
            System.out.println("DatumRodenja : " + treneri.get(i).getDatumRodenja());
            System.out.println("KontaktBroj : " + treneri.get(i).getKontaktBroj());
            System.out.println("TrenerId : " + treneri.get(i).getTrenerId());
            System.out.println("ClanskiBroj : " + treneri.get(i).getClanskiBroj());
            System.out.println("KorisnikId : " + treneri.get(i).getKorisnikId());
            System.out.println("----------------------------------");
        }
    }

    public void obrisiTrenera(Trener trener){
        int index = dohvatiTrenera(trener);
        if (index != -1) {
            treneri.remove(index);
        }
        serializacijaTrenera();
    }

    public void azurirajTrenera(Trener trener){
        int index = dohvatiTrenera(trener);
        if (index != -1) {
            treneri.set(index, trener);
        }
        serializacijaTrenera();
    }

    public int dohvatiTrenera(Trener trener){
        for(int i = 0; i < treneri.size(); i++){
            if (treneri.get(i).getTrenerId() == trener.getTrenerId()) {
                return i;
            }
        }
        return -1;
    }

    public void dodajTrenera(Trener trener){
        treneri.add(trener);
        serializacijaTrenera();
    }


    public void serializacijaTrenera() {
        
        try{
            
            //kreiran writer
            Writer writer = new FileWriter("treneri.json");
    
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            //convertanje liste u JSON File
            gson.toJson(treneri, writer);

            writer.close();
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void deserializacijaTrenera(){
        try {
            String data = new String(Files.readAllBytes(Paths.get("treneri.json")));
            Gson gson = new Gson();
            treneri = gson.fromJson(data, new TypeToken<ArrayList<Trener>>(){}.getType());
        } catch(Exception e) {
            System.out.println("Nije moguce ucitati podatke o treneru");
        }
    }
}
