class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer + " " +self.model + " has started moving")
    def stop(self):
        print(self.manufacturer + " " +self.model + " has stopped moving")

c1 = Car("Suzuki", "Baleno", "2017", "Manual", "Grey")
c2 = Car("Maruti", "800", "2019", "Automatic", "black")
c3 = Car("Skoda", "rapid", "2020", "Manual", "red")

c1.accelerate()
c2.stop()

