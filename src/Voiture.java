public class Voiture extends Vehicule {
    private int nombreDePortes;

    public Voiture(String marque, int anneeFabrication, String couleur, int nombreDePortes) {
        super(marque, anneeFabrication, couleur);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Nombre de portes: " + nombreDePortes);
    }

    @Override
    public void klaxonner() {
        System.out.println("Tut tut !");
    }
}
