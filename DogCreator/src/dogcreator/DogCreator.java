/*
 * Ilan Sela
 * 2/20/2022
 * JDK 17
 * Practice with Setters and Getters
 */
package dogcreator;

public class DogCreator {
    public static void main(String[] args) {
        //create dog objects
        Dog dog1 = new Dog("Texie", 25);
        Dog dog2 = new Dog("Juicy", 15);
        Dog dog3 = new Dog("Penny", 28);
        
        //print out dog name and weight
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight()+"lbs.");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Weight: " + dog2.getWeight()+"lbs.");
        System.out.println("Name: " + dog3.getName());
        System.out.println("Weight: " + dog3.getWeight()+"lbs.");
        System.out.print("\n");
        
        //Comparisons
        System.out.println(dog1.compare(dog2));
        System.out.println(dog1.compare(dog3));
        System.out.println(dog2.compare(dog3));
        System.out.print("\n");
        
        //dog1 gains weight
        dog1.setWeight(28);
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight()+"lbs.");
        System.out.println(dog1.compare(dog3));
    }
    
}
