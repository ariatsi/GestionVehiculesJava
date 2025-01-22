public class Moto extends Vehicule {
    private boolean hasSidecar;

    public Moto(String marque, int anneeFabrication, String couleur, boolean hasSidecar) {
        super(marque, anneeFabrication, couleur);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }

    @Override
    public void klaxonner() {
        System.out.println("Beep Beep !");
    }
}
