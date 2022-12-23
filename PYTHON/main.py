from car import Car
from account import Account
from UberX import UberX

if __name__ == "__main__":
    
    car = Car("AMS234",Account("Mario","12365489","da@gmail.com"),4)
    uberX = UberX ("AMS234",Account("Mario","12365489","da@gmail.com"),4,"Chevrolet","Spark")
    
    print(vars(car))
    print(vars(car.driver))

    print(vars(uberX))
    print(vars(uberX.driver))
    