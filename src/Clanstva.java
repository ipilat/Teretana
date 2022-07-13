import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.*;
import java.nio.file.Paths;

public class Clanstva {
    

    ArrayList<Clanstvo> clanstva;

    public Clanstva(){
        clanstva = new ArrayList<Clanstvo>();
        deserializacijaClanstva();
    }
    
    public void prikazClanstva(){
        for(int i = 0; i<clanstva.size();i++){
            System.out.println("-------------------------------------------------------");
            System.out.println("Cijena paketa: " + clanstva.get(i).getCijenaPaketa());
            System.out.println("Ime paketa: " + clanstva.get(i).getImePaketa());
            System.out.println("Korisnik id: " + clanstva.get(i).getKorisnikId());
            System.out.println("-------------------------------------------------------");
        }
        
    }
    public void obrisiClanstvo(Clanstvo clanstvo){
        int index = dohvatiKorisnika(clanstvo);
        if (index != -1) {
            clanstva.remove(index);
        }
        serializacijaClanstva();
    }

    public void azurirajClanstva(Clanstvo clanstvo){
        int index = dohvatiKorisnika(clanstvo);
        if (index != -1) {
            clanstva.set(index, clanstvo);
        }
        serializacijaClanstva();
    }

    public int dohvatiKorisnika(Clanstvo clanstvo){
        for(int i = 0; i < clanstva.size(); i++){
            if (clanstva.get(i).getKorisnikId() == clanstvo.getKorisnikId()) {
                return i;
            }
        }
        return -1;
    }

    public void dodajClanstvo(Clanstvo clanstvo){
        clanstva.add(clanstvo);
        serializacijaClanstva();
    }


    public void serializacijaClanstva() {
        
        try{
            
            //kreiran writer
            Writer writer = new FileWriter("clanstva.json");
    
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            //convertiranje liste u JSON File
            gson.toJson(clanstva, writer);

            writer.close();
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void deserializacijaClanstva(){
        try {
            String data = new String(Files.readAllBytes(Paths.get("clanstva.json")));
            Gson gson = new Gson();
            clanstva = gson.fromJson(data, new TypeToken<ArrayList<Clanstvo>>(){}.getType());
        } catch(Exception e) {
            System.out.println("Nije moguce ucitati podatke o clanstvu");
        }
    }


}
