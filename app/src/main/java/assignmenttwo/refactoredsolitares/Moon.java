package assignmenttwo.refactoredsolitares;

/**
 * Moon class which will inherit HeavenlyBody class as a parent class.
 */
public class Moon extends HeavenlyBody {  // we use keyword extends for inheritance.

  /**
   * we build the constructor.
   *
   * @param name as parameter.
   * @param avgRadiusInKm as parameter.
   */
  public Moon(String name, int avgRadiusInKm) { //constructor.
    super(name, avgRadiusInKm); //calling parent class's constructor.
  }

  @Override //overriding the parent class toString method.
  //gets name and avgRadiusInKm asparameters.
  public String toString() {
    // we use super.toString() to access super class toString method and modify it.
    return "Moon: " + super.toString();
  }

}
