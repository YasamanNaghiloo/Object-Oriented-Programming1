package assignmenttwo.refactoredsolitares;

/**
 * a public abstract class called HeavenlyBody.
 */
public abstract class HeavenlyBody {
  // our fields which is name and average radius in km.
  private String name;
  private int avgRadiusInKm;

  /**
   * the protected constructor that gets the parameters below.
   *
   * @param newName will access to the name field and sets it to the newName.
   *
   * @param radius will access the avgRadiusInKm field and sets it to the radius.
   */
  protected HeavenlyBody(String newName, int radius) {
    setName(newName);
    setAvgRadiusInKm(radius);
    
  }

  /**
   * getter method.
   *
   * @return returns the newName which is a string.
   */
  public String getName() {
    return name;
  }

  /**
   * setter method. this method sets the name and checks if it is null or not. it returns nothing.
   * if it is null, it throws an exception.
   *
   * @param newName the parameter is a string and is newName.
   */
  private final void setName(String newName) {
    if (newName == null) { 
      throw new IllegalArgumentException("name must not be null or empty");
    } else if (newName.equals("")) {
      throw new IllegalArgumentException("name must not be null or empty");
    }
    this.name = newName;
  }

  /**
  *  this method gets the radius.
  *
  * @return the radius.
  */

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * setter method.
   *
   * @param radius is an integer which wil set to the avgRadiusInKm.
   */
  private void setAvgRadiusInKm(int radius) {
    checkRadiusInKm(radius);
    this.avgRadiusInKm = radius;
  }

  /**
   * checks if the set radius is acceptable or not.
   *
   * @param radius an integer assigned to radius.
   */
  protected void checkRadiusInKm(int radius) {
    if (this instanceof Star && radius < 16700) {
      throw new IllegalArgumentException("Stars cannot be smaller than 16,700km");
    } else if (this instanceof Planet && (radius < 2000 || radius > 200000)) {
      throw new IllegalArgumentException("Planets must be between 2,000km and 200,000km");
    } else if (this instanceof Moon && (radius < 6 || radius > 10000)) {
      throw new IllegalArgumentException("Moons must be between 6km and 10,000km");
    }
  }
  
  /**
   * represents the string version of th class.
   *
   * @return returns the string version of the class.
   */
  @Override
  public String toString() {
    return name + "," + "average radius " + avgRadiusInKm + "km";

  }

  protected final void finalize() {
  }
  
}
