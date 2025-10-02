// Vehicle (Super class)
class Vehicle {
    private String name;
    private String modelNo;

    // Constructor
    public Vehicle(String name, String modelNo) {
        this.name = name;
        this.modelNo = modelNo;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
}