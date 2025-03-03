public class Chef {
    // Attribute
    private String name;
    private String biography;

    // Constructor
    // Setter
    Chef(String name, String biography){
        this.name = name;
        this.biography = biography;
    }

    // Getter
    String getName(){
        return name;
    }

    String getBiography(){
        return biography;
    }
}
