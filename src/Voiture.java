public class Voiture {
  
    private String model;
    private String type;
    private int puissance;

    public Voiture(String model, String type, int puissance) {
      this.model = model;
      this.type = type;
      this.puissance = puissance;
    }

    // Méthode pour créer un memento (sauvegarder l'état actuel de la voiture)
    public Memento sauvegarder() {
      return new Memento(model, type, puissance);
    }

    // Méthode pour restaurer l'état de la voiture à partir d'un memento
    public void restaurer(Memento memento) {
      this.model = memento.getmodel();
      this.type = memento.gettype();
      this.puissance = memento.getPuissance();
    }

    // Getters et setters pour les attributs
    public String getmodel() {
      return model;
    }

    public void setmodel(String model) {
      this.model = model;
    }

    public String gettype() {
      return type;
    }

    public void settype(String type) {
      this.type = type;
    }

    public int getPuissance() {
      return puissance;
    }

    public void setPuissance(int puissance) {
      this.puissance = puissance;
    }

    @Override
    public String toString() {
      return "model : " + model + ", type : " + type + ", Puissance : " + puissance;
    }
  

}
