class Car{
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passenger;

    public Car (String license, Account driver){
        this.license = license;
        this.driver = driver;
        this.passenger = 4;
    }

    void printDataCar(){
    
        if (this.passenger != null){
            System.out.println(this.license);
            System.out.println(this.driver.document);
            System.out.println(this.driver.name);
            System.out.println(this.driver.email);
            System.out.println(this.passenger);
        }        
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if (passenger == 4)
            this.passenger=passenger;
        else
            System.out.println("Asignar 4 pasajeros");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}