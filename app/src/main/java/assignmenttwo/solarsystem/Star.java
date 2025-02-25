package assignmenttwo.solarsystem;

import java.util.ArrayList;

/**
 * Star class which will inherit HeavenlyBody class as a parent class.
 */
public class Star extends HeavenlyBody {

  ArrayList<Planet> planets;

  /**
   * constructor.
   *
   * @param name          parameter.
   * @param avgRadiusInKm parameter.
   */
  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    this.planets = new ArrayList<Planet>();
  }

  /**
   * add planet method.
   *
   * @param name               string paramete.
   *
   * @param avgRadiusInKm      int paramete.
   *
   * @param avgOrbitRadiusInKm double paramete.
   *
   * @return will return Planet type name.
   */
  public Planet addPlanet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    Planet planet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm);
    planets.add(planet);
    return planet;
  }

  /**
   * getting the array of heavenly bodies.
   *
   * @return returns the array.
   */
  public HeavenlyBody[] getHeavenlyBodies() {

    ArrayList<HeavenlyBody> starArrayList = new ArrayList<>();
    Star star = new Star(getName(), getAvgRadiusInKm());
    starArrayList.add(star);

    for (Planet planet : planets) {
      Planet temp =
          new Planet(planet.getName(), planet.getAvgRadiusInKm(), planet.getAvgOrbitRadiusInKm());
      starArrayList.add(temp);

      for (Moon moon : planet.getMoons()) {
        Moon temp2 =
             new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm());
        starArrayList.add(temp2);
      }
        
    }
    
    HeavenlyBody[] starArray = new HeavenlyBody[starArrayList.size()];
    starArray = starArrayList.toArray(starArray);
    return starArray;

  }

  @Override
  public String toString() {
    return "Star: " + super.toString();
  }
}
