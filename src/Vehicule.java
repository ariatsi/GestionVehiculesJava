public abstract class Vehicule {
    protected String marque;
    protected int anneeFabrication;
    protected String couleur;

    public Vehicule(String marque, int anneeFabrication, String couleur) {
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
        this.couleur = couleur;
    }

    public void afficherDetails() {
        System.out.println("Marque: " + marque + ", Année: " + anneeFabrication + ", Couleur: " + couleur);
    }

    public abstract void klaxonner();
}
