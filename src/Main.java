
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Voiture voiture = new Voiture("Toyota", 2020, "Rouge", 4);
        garage.ajouterVehicule(voiture);
        System.out.println("\nLe véhicule suivant a été créé et ajouté au garage :");
        voiture.afficherDetails();

        Camion camion = new Camion("Volvo", 2019, "Bleu", 15);
        garage.ajouterVehicule(camion);
        System.out.println("\nLe véhicule suivant a été créé et ajouté au garage :");
        camion.afficherDetails();

        Moto moto = new Moto("Harley Davidson", 2021, "Noir", false);
        garage.ajouterVehicule(moto);
        System.out.println("\nLe véhicule suivant a été créé et ajouté au garage :");
        moto.afficherDetails();

        /*
        garage.ajouterVehicule(new Voiture("Toyota", 2020, "Rouge", 4));
        garage.ajouterVehicule(new Camion("Volvo", 2019, "Bleu", 15));
        garage.ajouterVehicule(new Moto("Harley Davidson", 2021, "Noir", false));
         */
        System.out.println("\nLe contenu final du Garage : ");
        garage.afficherGarage();
    }
}