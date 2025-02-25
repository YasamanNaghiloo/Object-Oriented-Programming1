package assignmenttwo.solarsystem;

/**
 * Moon class which will inherit HeavenlyBody class as a parent class.
 */
public class Moon extends HeavenlyBody {  // we use keyword extends for inheritance.

  private double avgOrbitRadiusInKm;
  
  /**
   * we build the constructor.
   *
   * @param name as parameter.
   * @param avgRadiusInKm as parameter.
   */
  protected Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) { //constructor.
    super(name, avgRadiusInKm);

    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("orbit radius moon should not be less than 60");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
  }


  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }


  @Override //overriding the parent class toString method.
  public String toString() {
    return "Moon: " + super.toString()
      + " average orbit radius: " + getAvgOrbitRadiusInKm() + " km";
  }

}
