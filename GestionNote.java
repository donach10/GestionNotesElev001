import java.util.Scanner;

public class GestionNote {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
// Enregistrement des notes des élèves
        System.out.print("Entrez le nombre d'élèves à gérer : ");
        int nbEleves = clavier.nextInt();
        double[] notes = new double[nbEleves];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double somme = 0;

        for (int i = 0; i < nbEleves; i++) {
            System.out.print("Entrez la note de l'élève " + (i + 1) + " : ");
            notes[i] = clavier.nextDouble();

            // Calcul du maximum et minimum
            max = Math.max(max, notes[i]);
            min = Math.min(min, notes[i]);

            somme += notes[i];
        }

        double moyenne = somme / nbEleves;
// nbSupMoyenne : le nombre d'élèves ayant obtenis une note supérieur à la moyenne 
// nbAdmis : le nombre d'élèves ayant obtenis une note supérieur à  MoyAdmis = 10  
// nbRattrapage : le nombre d'élèves ayant obtenis une note supérieur ou égale à  Rattr = 7  et inférieure à MoyAdmis
// nbRecaller : le nombre d'élèves ayant obtenis une note inférieur à Rattr = 7  

        int nbSupMoyenne = 0;
        int nbAdmis = 0;
        int nbRattrapage = 0;
        int nbRecaller = 0;
        double MoyAdmis = 10  ;
        double Rattr = 7 ;
        
// Parcours du tableau et mise à jour des valeurs
        for (double note : notes) {
            if (note >= moyenne) {
                nbSupMoyenne++;
            }
            if (note >= MoyAdmis) {
                nbAdmis++;
            }
            if (note >= Rattr && note < MoyAdmis) {
                nbRattrapage++;
            }
            if (note < Rattr) {
                nbRecaller++;
            }
        }

        System.out.println("########## Les Statistiques : ##########");
        System.out.println("Note maximale : " + max);
        System.out.println("Note minimale : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);
        System.out.println("Nombre d'élèves ayant une note supérieure à la moyenne : " + nbSupMoyenne);
        System.out.println("Nombre d'élèves admis : " + nbAdmis);
        System.out.println("Nombre d'élèves en rattrapage : " + nbRattrapage);
        System.out.println("Nombre d'élèves recalés : " + nbRecaller);
    }
} 
    

