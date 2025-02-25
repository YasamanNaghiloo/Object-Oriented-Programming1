package assignmenttwo.solitares;

import java.lang.IllegalArgumentException;

/**
 * public class Moon with name and avgRadiusInKm as fields.
 */
public class Moon {

  private String name;
  private int avgRadiusInKm;

  /**
   * constructor with parameters below in order to set values for it when we
   * create an object.
   *
   * @param newName string parameter newName.
   * @param radius  integer parameter radius.
   */
  public Moon(String newName, int radius) {

    setName(newName);
    setAvgRadiusInKm(radius);
  }

  /**
   * getter method for showing newName.
   *
   * @return returns name string.
   */
  public String getName() {
    return name;
  }

  /**
   * setter method that is void and doesn't retun anything.
   * checks also if the name is null or not.
   *
   * @param newName takes newName as parameter which is a string.
   */
  private final void setName(String newName) { // void = no return

    if (newName == null) {
      throw new IllegalArgumentException("name must not be null or empty");
    } else if (newName.equals("")) {
      throw new IllegalArgumentException("name must not be null or empty");
    }

    this.name = newName;

  }

  /**
   * gets average radius in km.
   *
   * @return returns the integer avgRadiusInKm.
   */
  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * sets the radius and it can not be changed later du to private acces modifyer.
   *
   * @param radius gets radius as metod parameter.
   */
  private void setAvgRadiusInKm(int radius) { // returns nothing it is void.

    if (radius < 6 || radius > 10000) { // checks radius range.
      throw new IllegalArgumentException("invald radius range, it must be between 6 and 10000 km");
    }
    this.avgRadiusInKm = radius;

  }

  /**
   * using toString method to return string version of the class.
   */
  @Override
  public String toString() {
    return "Moon: " + name + "," + "average radius " + avgRadiusInKm + "km";
  }

  protected final void finalize() {
  }

}
