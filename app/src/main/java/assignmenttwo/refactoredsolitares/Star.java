package assignmenttwo.refactoredsolitares;

/**
 * Star class which will inherit HeavenlyBody class as a parent class.
 */
public class Star extends HeavenlyBody {  // we use keyword extends for inheritance.

  /**
 * constructor.
 *
 * @param name parameter.
 * @param avgRadiusInKm parameter.
 */
  public Star(String name, int avgRadiusInKm) {  //constructor.
    super(name, avgRadiusInKm);  //calling parent class's constructor with super.
  }

  @Override  //overriding the parent class toString method.
  //gets name and avgRadiusInKm as parameters.
  public String toString() {
    // we use super.toString() to access super class toString method and modify it.
    return "Star: " + super.toString();
  }
}

