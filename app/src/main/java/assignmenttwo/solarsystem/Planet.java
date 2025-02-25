package assignmenttwo.solarsystem;

import java.util.ArrayList;

/**
 * planet class which will inherit HeavenlyBody class as a parent class.
 */
public class Planet extends HeavenlyBody { // we use keyword extends for inheritance.

  private double avgOrbitRadiusInKm;
  private ArrayList<Moon> moons;

  protected Planet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    setAvgOrbitRadiusInKm(avgOrbitRadiusInKm);
    this.moons = new ArrayList<Moon>();
  }


  /**
   *addMoon method which will check the average orbit radius size condition.
   *
   * @param name               parameter string type.
   * @param avgRadiusInKm      int type parameter.
   * @param avgOrbitRadiusInKm  double type method parameter.
   * @return retunrs Moon type arraylist.
   */
  public Moon addMoon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    Moon moon = new Moon(name, avgRadiusInKm, avgOrbitRadiusInKm);
    if (moon.getAvgRadiusInKm() > this.getAvgRadiusInKm() / 2) {
      throw new IllegalArgumentException("Moon radius unacceptable");

    }
    moons.add(moon);
    return moon;

  }

  public ArrayList<Moon> getMoons() {
    return new ArrayList<>(moons);
  }

  private void setAvgOrbitRadiusInKm(double avgOrbitRadiusInKm) {
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("average planet orbit radius must not be less than 18000");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
  }


  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  
  /**
   * get HeavenlyBody method.
   *
   * @return an array of heavnely bodies.
   */
  public HeavenlyBody[] getHeavenlyBodies() {

    ArrayList<HeavenlyBody> planetsArrayList = new ArrayList<>();
    Planet planet = new Planet(getName(), getAvgRadiusInKm(), avgOrbitRadiusInKm);
    planetsArrayList.add(planet);
    
    for (Moon moon : moons) {
      Moon temp = new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm());
      planetsArrayList.add(temp);
    }
    
    // 
    HeavenlyBody[] planetArray = new HeavenlyBody[planetsArrayList.size()];
    planetArray =  planetsArrayList.toArray(planetArray);
    //planetArray = planetsArrayList.toArray(planetArray);
    return planetArray;

  }

  @Override
  public String toString() {

    return "Planet: " + super.toString()
      + " average orbit radius: " + getAvgOrbitRadiusInKm() + " km";
  }

}