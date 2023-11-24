import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient {

    private List<Patient> listP;

    public ListPatients() {
        this.listP = new ArrayList<>();
    }

    @Override
    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    @Override
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    @Override
    public boolean rechercherPatient(Patient p) {
        return listP.contains(p);
    }

    @Override
    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    @Override
    public void afficherPatients() {
        listP.forEach(System.out::println);
    }

    @Override
    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted(Comparator.comparing(Patient::getNom, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public void PatientSansRedondance() {
        List<Patient> distinctPatients = listP.stream()
                .distinct()
                .collect(Collectors.toList());

        distinctPatients.forEach(System.out::println);

    }

}
