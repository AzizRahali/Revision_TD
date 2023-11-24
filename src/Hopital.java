import java.util.Map;
import java.util.TreeMap;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        this.medecinPatients = new TreeMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).ajouterPatient(p);
        } else {
            // Handle the case when the Medecin is not in the map
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Medecin: " + medecin);
            patients.afficherPatients();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).afficherPatients();
        } else {
            // Handle the case when the Medecin is not in the map
        }
    }
}
