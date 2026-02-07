package JAVA;

public class Lab0014_Constructors {
    public static void main(String[] args) {
        animalCat defaultCatConstructor = new animalCat();
        animalCat firstCat = new animalCat("Mufasa");
        System.out.println(firstCat.catName);
    }
}

class animalCat {
    String catName;
    // Default Constructor
    animalCat() {
        System.out.println("Default Constructor for Animal Cat Class");
    }
    // Parameterised Constructor
    animalCat(String nameGiven) {
        this.catName = nameGiven;
    }
}