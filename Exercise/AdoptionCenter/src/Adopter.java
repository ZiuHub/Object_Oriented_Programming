import java.util.*;

public class Adopter {
    // Attribute
    List <Pet> adoptedPets = new ArrayList<>();
    private String name;

    // Constructor
    // Setter
    Adopter(String name){
        this.name = name;
    }

    // Getter
    String getName(){
        return name;
    }

    void displayAdoptedPets(){
        System.out.println(getName() + "'s Adopted Pets:");
        for(Pet pet : adoptedPets){
            pet.printPet();
        }
    }
}
