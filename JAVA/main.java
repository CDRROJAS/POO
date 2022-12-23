class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        /* 
        FIRST CONSTRUCTOR METHOD  
        Car car = new Car();
        car.license = "RJV936";
        car.driver = "Andres";
        car.passenger = 4;
        */
        //SECOND CONSTRUCTOR METHOD FOR CAR WITH NEW CONSTRUCTOR ACCOUNT
        Car car = new Car("RDS963",new Account("David","78954213", "JK@GMAIL.COM", "8764131ASD"));
        car.printDataCar();
        UberX uberX = new UberX("UJH783",new Account("Andres","9475421", "LK@GMAIL.COM", "8897jghgjh"),"CHEVROLET","SPARK");
        uberX.printDataCar();
    }
     
}