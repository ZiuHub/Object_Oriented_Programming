import java.util.*;

class Main {
    static ArrayList<Human> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(new Student());
        list.add(new Worker());
        System.out.println("Main class is used.");
    }
}

class Human {
    private String nim;

    public Human(){}
    public Human(int x){}
    public Human(int x, int y){}
    public Human(String nim, int a){
        this.nim = nim;
    }

    // setter getter
    public void setNIM(String v){
        nim = v;
    }
    public String getNIM(){
        return nim;
    }
}

class Student extends Human {}
class Worker extends Human {}