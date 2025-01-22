# Système de Gestion de Véhicules en Java

## Description
Ce projet Java est une application de gestion de véhicules qui démontre l'utilisation de l'héritage et du polymorphisme. Il permet de manipuler différentes sortes de véhicules tels que des voitures, des camions et des motos, en les ajoutant à un garage et en affichant leurs détails et sons spécifiques.

## Objectifs du TP
- Mettre en pratique l'implémentation de l'héritage en Java.
- Utiliser le polymorphisme pour effectuer des opérations communes sur une collection de véhicules.
- Démontrer la manipulation de classes et d'objets en Java.

## Fonctionnalités
- Ajout de véhicules de différents types à un garage.
- Affichage des détails spécifiques à chaque type de véhicule.
- Simulation de sons spécifiques pour chaque type de véhicule grâce à la méthode `klaxonner()`.

## Structure des fichiers
- `Vehicule.java` : Classe abstraite de base pour tous les types de véhicules.
- `Voiture.java` : Classe dérivée de `Vehicule`, spécifique aux voitures.
- `Camion.java` : Classe dérivée de `Vehicule`, spécifique aux camions.
- `Moto.java` : Classe dérivée de `Vehicule`, spécifique aux motos.
- `Garage.java` : Classe contenant les méthodes pour ajouter des véhicules et afficher les informations du garage.
- `Main.java` : Classe principale qui exécute l'application.

## Licence
Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.
