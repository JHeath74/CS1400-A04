/*******************************************************
* Sample Code - do not modify
* Assignment: Jet Country
* Testing Class Jet
* Jeffory Heath
* September 19th, 2016
*******************************************************/

public class A04
{
   public static void main(String[] args)
   {
   
   Jet jumboJet = new Jet("Boeing", "747", 4, false);
   
   System.out.println("We are Testing Class Jet:");
   System.out.println("");
   System.out.printf("Manufacturer: %s%n", jumboJet.getManufacturer());
   System.out.printf("Model: %s%n", jumboJet.getModel());
   System.out.printf("Number of Engines: %d%n", jumboJet.getNumberOfEngines());
   System.out.printf("Is Fighter Jet: %s%n", jumboJet.getFighter());
   System.out.println("");
   
   Jet stealthFighter = new Jet("Lockheed Martin", "F-22", 2, true);
   
   System.out.printf("Manufacturer: %s%n", stealthFighter.getManufacturer());
   System.out.printf("Model: %s%n", stealthFighter.getModel());
   System.out.printf("Number of Engines: %d%n", stealthFighter.getNumberOfEngines());
   System.out.printf("Is Fighter Jet: %s%n", stealthFighter.getFighter());
   
   System.out.println("");
   System.out.println("We are Testing Country Class:");
   System.out.println("");
   
   Country Macau = new Country("Macau", 453000, 6);
   System.out.printf("Name: %s%n",Macau.getName());
   System.out.printf("Population: %,d%n",Macau.getPopulation());
   System.out.printf("Area: %,d%n",Macau.getArea());
   System.out.printf("Population Density: %,d%n",Macau.populationDensity());
   System.out.println("");
   
   Country USA = new Country("USA", 318900000, 3539225);
   System.out.printf("Name: %s%n",USA.getName());
   System.out.printf("Population: %,d%n",USA.getPopulation());
   System.out.printf("Area: %,d%n",USA.getArea());
   System.out.printf("Population Density: %,d%n",USA.populationDensity());
   System.out.println("");
   
   Country Burma = new Country("Burma", 35442972, 261228);
   System.out.println("Year: 1983");
   System.out.printf("Name: %s%n",Burma.getName());
   System.out.printf("Population: %,d%n",Burma.getPopulation());
   System.out.printf("Area: %,d%n",Burma.getArea());
   System.out.printf("Population Density: %,d%n",Burma.populationDensity());
   System.out.println("");
   
   Country Myanmar = new Country("Myanmar", 51419420, 196);
   System.out.println("Year: 2014");
   System.out.printf("Name: %s%n",Myanmar.getName());
   System.out.printf("Population: %,d%n",Myanmar.getPopulation());
   System.out.printf("Area: %,d%n",Myanmar.getArea());
   System.out.printf("Population Density: %,d%n",Myanmar.populationDensity());
   }
}