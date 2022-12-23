function Car(license, Account, passenger){
    this.id;
    this.license = license;
    this.driver = Account;
    this.passenger = passenger;
}

Car.prototype.printCar = function(){
    console.log(this.license)
    console.log(this.passenger)
    console.log(this.driver.name)
    console.log(this.driver.document)
    console.log(this.driver.email)
}