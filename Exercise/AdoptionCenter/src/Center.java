import java.util.*;

public class Center {
    private List <Pet> availablePets = new ArrayList<>();

    void addPet(Pet pet){
        System.out.println("Pet added to adoption center: " + pet.getName());
        availablePets.add(pet);
    }

    void adoptPet(Adopter adopter, Pet pet){
        System.out.println(adopter.getName() + " adopted: " + pet.getName());
        availablePets.remove(pet);
        adopter.adoptedPets.add(pet);
    }

    void returnPet(Adopter adopter, Pet pet){
        System.out.println(adopter.getName() + " returned: " + pet.getName());
        adopter.adoptedPets.remove(pet);
        availablePets.add(pet);
    }

    void displayAvailablePets(){
        System.out.println("Available Pets in Adoption Center:");
        for(Pet pet : availablePets){
            pet.printPet();
        }
    }
}
