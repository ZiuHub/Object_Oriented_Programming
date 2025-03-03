public class Main {
    public Main() {
        Pet pet1 = new Pet("Buddy", "Dog", 3);
        Pet pet2 = new Pet("Whiskers", "Cat", 2);

        Center center = new Center();
        center.addPet(pet1);
        center.addPet(pet2);

        Adopter adopter = new Adopter("Emma");

        center.adoptPet(adopter, pet1);
        center.adoptPet(adopter, pet2);

        adopter.displayAdoptedPets();

        center.returnPet(adopter, pet1);

        adopter.displayAdoptedPets();

        center.displayAvailablePets();
    }

    public static void main(String[] args) {
        new Main();
    }
}

/*
Pet added to adoption center: Buddy
Pet added to adoption center: Whiskers
Emma adopted: Buddy
Emma adopted: Whiskers
Emma's Adopted Pets:
Name: Buddy
Type: Dog
Age: 3 years
------------------------
Name: Whiskers
Type: Cat
Age: 2 years
------------------------
Emma returned: Buddy
Emma's Adopted Pets:
Name: Whiskers
Type: Cat
Age: 2 years
------------------------
Available Pets in Adoption Center:
Name: Buddy
Type: Dog
Age: 3 years
------------------------
 */