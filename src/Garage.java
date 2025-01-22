public class Garage {
    private Vehicule[] vehicules;
    private int index; // Pour suivre le nombre de véhicules ajoutés

    public Garage() {
        vehicules = new Vehicule[1]; // Taille initiale du tableau
        index = 0;
    }

    public void ajouterVehicule(Vehicule v) {
        if (index >= vehicules.length) {
            agrandirGarage();
        }
        vehicules[index] = v;
        index++;
    }

    private void agrandirGarage() {
        Vehicule[] nouveauVehicules = new Vehicule[vehicules.length + 1];
        System.arraycopy(vehicules, 0, nouveauVehicules, 0, vehicules.length);
        vehicules = nouveauVehicules;
    }

    public void afficherGarage() {
        for (int i = 0; i < index; i++) {
            vehicules[i].afficherDetails();
            vehicules[i].klaxonner();
        }
    }
}
