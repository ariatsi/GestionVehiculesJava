public class Camion extends Vehicule {
    private double capaciteChargement;

    public Camion(String marque, int anneeFabrication, String couleur, double capaciteChargement) {
        super(marque, anneeFabrication, couleur);
        this.capaciteChargement = capaciteChargement;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Capacité de chargement: " + capaciteChargement + " tonnes");
    }

    @Override
    public void klaxonner() {
        System.out.println("Honk Honk !");
    }
}
