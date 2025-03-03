public class Car {
    private String model;
    private String type;
    private String license;

    Car(String model, String type, String license){
        this.model = model;
        this.type = type;
        this.license = license;
    }

    String getModel(){
        return model;
    }

    String getType(){
        return type;
    }

    String getLicense(){
        return license;
    }

    void displayCars(){
        System.out.println("Model: " + getModel());
        System.out.println("Type: " + getType());
        System.out.println("License Plate: " + getLicense());
        System.out.println("------------------------");
    }
}

/*
Model: Toyota Corolla
Type: Sedan
License Plate: B 1234 AB
------------------------
 */