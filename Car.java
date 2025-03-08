//Question: Write a program to create a class Car with attributes model, year, and price. 
//Create objects of the class and display the details.
//1st class & oobject program.
class Car {
    String model;
    int year;
    double price;

    Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 2020, 24000);
        Car car2 = new Car("Honda Accord", 2021, 26000);

        car1.displayDetails();
        car2.displayDetails();
    }
}
