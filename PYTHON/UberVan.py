from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMateria = []

    def __init__(self, license, driver, passenger, typeCarAccepted, seatsMateria):
        super().__init__(license, driver, passenger)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMateria = seatsMateria