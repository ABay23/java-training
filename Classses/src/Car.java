public class Car {

    private String carMake = "Tesla";
    private String carModel = "Model X";
    private String carColor = "Blue";
    private int carDoors = 2;
    private Boolean carConvertible = true;

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarDoors() {
        return carDoors;
    }

    public Boolean getCarConvertible() {
        return carConvertible;
    }

    public void setCarMake(String carMake){
        this.carMake = carMake;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarDoors(int carDoors) {
        this.carDoors = carDoors;
    }

    public void setCarConvertible(Boolean carConvertible) {
        this.carConvertible = carConvertible;
    }

    public void carFeatures(){
        System.out.println(carDoors + "-Door " +
                carColor + " " +
                carMake + " " +
                carModel + " "+
                (carConvertible ? "Convertible" : ""));
    }
}
