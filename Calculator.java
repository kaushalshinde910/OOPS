//Question: Demonstrate method overloading and method overriding with a simple example.
//Polymorphism (Method Overloading and Overriding)

public class Calculator {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    // Method Overriding
    @Override
    int add(int a, int b) {
        System.out.println("Advanced Addition:");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 numbers: " + calc.add(5, 10));
        System.out.println("Addition of 3 numbers: " + calc.add(5, 10, 15));

        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Overridden Addition of 2 numbers: " + advCalc.add(5, 10));
    }
}
