// Car (Sub class)
class Car extends Vehicle {
    private int noOfGears;

    // Constructor
    public Car(String name, String modelNo, int noOfGears) {
        super(name, modelNo); // Call super constructor
        this.noOfGears = noOfGears;
    }

    // Getters and setters
    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
}