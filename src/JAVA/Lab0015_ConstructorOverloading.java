package JAVA;

public class Lab0015_ConstructorOverloading {
    public static void main(String[] args) {
        constructorOverloading defaultConstructor = new constructorOverloading();
        System.out.println(defaultConstructor);

        constructorOverloading parameterisedConstructor = new constructorOverloading("BMW", "01M01");
        System.out.println(parameterisedConstructor.carName + " AND " +parameterisedConstructor.carModel);

        constructorOverloading snatchingConstructor = new constructorOverloading("BMW", "01M01", 34);
        System.out.println(snatchingConstructor.carName + " AND " + snatchingConstructor.carModel + " AND " + snatchingConstructor.carAverage);
    }
}

class constructorOverloading {
    String carName;
    String carModel;
    Integer carAverage;

    constructorOverloading(){
        System.out.println("This is default constructor!");
    }

    constructorOverloading(String givenCarName, String givenCarModel) {
        this.carName = givenCarName;
        this.carModel = givenCarModel;
    }

    constructorOverloading(String givenCarName, String givenCarModel, Integer givenCarAverage) {
        this(givenCarName, givenCarModel);
        this.carAverage = givenCarAverage;
    }
}