public class Pet {
    // Attribute
    private String name;
    private String type;
    private Integer age;

    // Constructor
    // Setter
    Pet(String name, String type, Integer age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Getter
    String getName(){
        return name;
    }

    String getType(){
        return type;
    }

    Integer getAge(){
        return age;
    }

    void printPet(){
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("------------------------");
    }
}

/*
Name: Buddy
Type: Dog
Age: 3 years
------------------------
*/
