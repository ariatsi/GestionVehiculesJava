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
        for (Vehicule v : vehicules) {
            if (v != null) {
                v.afficherDetails();
                v.klaxonner();
            }
        }
        /*
        for (int i = 0; i < index; i++) {
            vehicules[i].afficherDetails();
            vehicules[i].klaxonner();
        }
         */
    }

    // Retrait d'un véhicule par son indice : Facultatif
    public void retirerVehicule(int idx) {
        if (idx >= 0 && idx < index) {
            for (int i = idx; i < index - 1; i++) {
                vehicules[i] = vehicules[i + 1];
            }
            vehicules[index - 1] = null;
            index--;
        } else {
            System.out.println("Index invalide. Aucun véhicule retiré.");
        }
    }
}
