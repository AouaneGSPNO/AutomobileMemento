public class VoitureDesignHistory {
  public static void main(String[] args) {

    System.out.println("\n*********************** TEST MEMENTO VOITURE *************\n");
    // Création de la conception initiale de la voiture
    Voiture voiture = new Voiture("Modèle A200", "CITADINE", 136);

    // Sauvegarde de l'état actuel de la voiture
    Memento memento = voiture.sauvegarder();

    // Modification de la conception de la voiture
    voiture.setmodel ("Modèle C200");
    voiture.settype ("BERLINE");
    voiture.setPuissance(170);

    // Affichage de l'état actuel de la voiture
    System.out.println("État actuel de la voiture : " + voiture);

    // Restauration de l'état précédent de la voiture
    voiture.restaurer(memento);

    // Affichage de l'état restauré de la voiture
    System.out.println("État restauré de la voiture : " + voiture);
  }




  
}
