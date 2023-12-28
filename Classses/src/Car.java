public class Car {

    private String carMake = "Tesla";
    private String carModel = "Model X";
    private String carColor = "Blue";
    private int carDoors = 2;

    private Boolean carConvertible = true;
    public void carFeatures(){
        System.out.println(carDoors + "-Door " +
                carColor + " " +
                carMake + " " +
                carModel + " "+
                (carConvertible ? "Convertible" : ""));
    }
}
