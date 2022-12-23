class Car{
    constructor(license, Account, passenger){
        this.id;
        this.license = license;
        this.driver = Account;
        this.passenger = passenger;
    }

    printDataCar(){
        console.log(this.license)
        console.log(this.passenger)
        console.log(this.driver.name)
        console.log(this.driver.email)
        console.log(this.driver.document)
    }

}