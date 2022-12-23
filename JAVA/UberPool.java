public class UberPool extends Car{
    String brand;
    String model;

    public UberPool (String license, Account driver, Integer passenger, String brand, String model){
        super(license,driver);
        this.brand = brand;
        this.model = model;
    }
        
}
