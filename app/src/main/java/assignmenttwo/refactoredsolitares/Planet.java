package assignmenttwo.refactoredsolitares;

/**
 * Planet class which will inherit HeavenlyBody class as a parent class.
 */
public class Planet extends HeavenlyBody {   // we use keyword extends for inheritance.
  public Planet(String name, int avgRadiusInKm) {   //constructor.
    super(name, avgRadiusInKm);  //calling parent class's constructor with super.
  }


  @Override  //overriding the parent class toString method.
  //gets name and avgRadiusInKm as parameters.
  public String toString() {
    // we use super.toString() to access super class toString method and modify it.
    return "Planet: " + super.toString();
  }

}