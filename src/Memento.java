public class Memento {
  private final String model;
  private final String type;
  private final int puissance;
  public Memento(String model, String type, int puissance) {
    this.model=model;
    this.type=type;
    this.puissance=puissance;
  }

  public String getmodel() {
    return model;
  }

  public String gettype() {
    return type;
  }

  public int getPuissance() {
    return puissance;
  }
}
